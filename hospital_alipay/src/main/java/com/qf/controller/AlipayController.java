package com.qf.controller;

import com.alipay.api.AlipayApiException;
import com.qf.config.AlipayUtil;
import com.qf.dao.UserOrderMapper;
import com.qf.domain.PageBean;
import com.qf.domain.ResultBean;
import com.qf.domain.UserOrder;
import com.qf.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
            userOrder.setOrderNum(alipayUtil.tradeno());
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

    //修改支付状态
    @RequestMapping(value = "/payback",method = RequestMethod.POST)
    public void payback(@RequestBody UserOrder userOrder){
        //修改订单状态
        userOrder.setStatement("已支付");
        //修改订单时间
        userOrder.setGmtModified(new Date());
        System.out.println(userOrder);
        alipayService.updateState(userOrder);
    }
}
