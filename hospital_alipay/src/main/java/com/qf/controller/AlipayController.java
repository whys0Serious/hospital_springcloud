package com.qf.controller;

import com.alipay.api.AlipayApiException;
import com.qf.config.AlipayUtil;
import com.qf.dao.UserOrderMapper;
import com.qf.domain.PageBean;
import com.qf.domain.ResultBean;
import com.qf.domain.UserMsg;
import com.qf.domain.UserOrder;
import com.qf.service.AlipayService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class AlipayController {

    @Autowired
    private AlipayUtil alipayUtil;
    @Autowired
    private AlipayService alipayService;
    //支付挂号订单
    @RequestMapping(value = "/pay",method = RequestMethod.POST)
    public String pay(@RequestBody UserOrder userOrder){

        String pay="";
        System.out.println("第一次订单号："+userOrder.getOrderNum());
        try {
            //调用支付宝接口
         pay = alipayUtil.pay(userOrder.getPrice(), userOrder.getDepName(),userOrder.getOrderNum());
         //时间为空时设置创建时间
            if(userOrder.getGmtCreate()==null){
                userOrder.setGmtCreate(new Date());
            }
            //设置修改时间
            userOrder.setGmtModified(new Date());
            //新增订单信息，状态为未支付
            userOrder.setStatement("待支付");
            //获取订单便编号
            userOrder.setOrderNum(alipayUtil.tradnum);
            alipayService.saveOrder(userOrder);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return pay;//返回支付宝提供的表单
    }

    //查询用户订单
    @RequestMapping(value = "/showOrderByPage",method = RequestMethod.POST)
    public ResultBean showOrder(@RequestBody PageBean pageBean){
        if(pageBean.getPage()==null){
                  pageBean.setPage(1);
        }
        //根据当前页获得起始下标
        pageBean.setPageSize((pageBean.getPage()-1)*pageBean.getSize());
        //查询订单
        List<UserOrder> showOrder = alipayService.showOrder(pageBean);
        //查询总条数
        int count = alipayService.CountByName(pageBean.getId());
        //封装返回结果集
        ResultBean resultBean=new ResultBean();
        resultBean.setList(showOrder);
        resultBean.setTotal(count);
        return resultBean;
    }

    @Autowired
    private RedisTemplate redisTemplate;
    //修改支付状态
    @RequestMapping(value = "/payback",method = RequestMethod.POST)
    public void payback(@RequestBody UserOrder userOrder){
        System.out.println("回调支付编号："+userOrder.getOrderNum());
        if(userOrder.getOrderNum()!=null&&userOrder.getUserId()!=null){
            //修改订单时间
            userOrder.setGmtModified(new Date());
            // 存入redis排号
            //先从redis查询当前科室排号人数,当前无法直接获得科室 使用订单号查询
            UserOrder userOrder1 = alipayService.findByOrderNum(userOrder.getOrderNum());
            //此处存入redis键为num+科室名与医生名 具体到医生排号
            Integer number =(Integer)redisTemplate.opsForValue().get("num" + userOrder1.getDepName()+userOrder1.getDocName());
            if(number==null){//若暂无排号则赋值为1
                redisTemplate.opsForValue().set("num"+userOrder1.getDepName()+userOrder1.getDocName(),1);
            }else{//否则进行+1计算
                redisTemplate.opsForValue().set("num"+userOrder1.getDepName()+userOrder1.getDocName(),number+1);
            }
            //redis根据排号存入当前科室挂号人信息(根据排号码对应挂号人)
            //再次发起redis查询获得本人排号
            Integer userNum =(Integer) redisTemplate.opsForValue().get("num" + userOrder1.getDepName()+userOrder1.getDocName());
            //挂号人信息存入redis
            redisTemplate.opsForValue().set("que"+userOrder1.getDepName()+userOrder1.getDocName()+userNum,userOrder1.getUserId());
            userOrder.setStatement("已支付");
            alipayService.updateState(userOrder);
            //修改订单状态
            System.out.println("已支付订单号："+userOrder.getOrderNum());
        }
    }

    //根据排号号码查询用户信息
    @RequestMapping("/showNumUser")
    public UserMsg showNumUser(String depart,String docName,int num){
        Integer id=(Integer) redisTemplate.opsForValue().get("que" + depart+docName + num);
        long parseLong = Long.valueOf(id);
        System.out.println(parseLong);
        UserMsg byUserId = alipayService.findByUserId(parseLong);
        return byUserId;
    }

    //查询当前科室总排号数
    @RequestMapping("/showNums")
    public Integer showNums(String depart,String doc){
        Integer integer =(Integer) redisTemplate.opsForValue().get("num" + depart + doc);
        return integer;
    }
    //查询当前科室在等排号数
    @RequestMapping("/showNowNums")
    public Integer showNowNums(String depart,String doc){
        Integer integer=(Integer) redisTemplate.opsForValue().get("nowNum"+depart+doc);
        return integer;
    }

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //呼叫下一位排号病人
    @RequestMapping("/callNext")
    public void  callNext(String depart,String doc,Integer num){
        //先从redis中取出当前被叫信息
        Integer uid = (Integer)redisTemplate.opsForValue().get("que" + depart + doc + (num+1));
        Long id = Long.valueOf(uid);
        //将需要传递的信息封装到对象中发送给队列
        UserOrder userOrder=new UserOrder();
        userOrder.setUserId(id);
        userOrder.setDepName(depart);
        userOrder.setDocName(doc);
        //将信息传给rabbit
        rabbitTemplate.convertAndSend("sendMessage",userOrder);
        //同时删除上一条redis中的用户
        redisTemplate.expire("que"+depart+doc+num,0,TimeUnit.SECONDS);
        //修改剩余预约人数
        Integer u =(Integer) redisTemplate.opsForValue().get("num" + depart + doc);
        redisTemplate.opsForValue().set("nowNum"+depart+doc,u-1);
    }
}
