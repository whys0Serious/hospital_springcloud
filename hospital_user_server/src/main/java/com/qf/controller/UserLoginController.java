package com.qf.controller;

import com.qf.domain.UserMsg;
import com.qf.service.UserLoginService;
import com.qf.utils.Md5Utils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;


    /*
    * 注册
    * */

    //查询手机号是否可用
    @RequestMapping(value = "/checkPhone")
    public String checkName(String phone){
        UserMsg userMsg1 = (UserMsg) userLoginService.checkPhone(phone);
        if(userMsg1==null){//数据库结果为空则可用
            return "手机号可用";
        }
        return "该手机号已经被注册";
    }

    //查询邮箱是否可用
    @RequestMapping("/checkMail")
    public String checkMail(String mail){
        UserMsg userMsg = userLoginService.checkMail(mail);
        if(userMsg==null){//数据库结果为空则可用
            return "邮箱可用";
        }
        return "邮箱已经被注册";
    }

    @Autowired
    private RabbitTemplate rabbitTemplate;
    /*
    注册用户信息，状态为未激活，发送给消息队列
    * */
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public void regist(@RequestBody UserMsg userMsg){

        //将用户信息存入数据库，状态为0未激活状态不可登录
        byte i=0;//状态字段为byte类型 需要单独赋值
        userMsg.setIsActivated(i);
        //身份设置为用户
        userMsg.setIdentity("用户");
        //设置创建时间
        userMsg.setGmtCreate(new Date());
            //对密码进行md5加密,盐为用户名
        userMsg.setUserPass(Md5Utils.encryptPassword(userMsg.getUserPass(), userMsg.getUserName()));
        //添加到数据库
        userLoginService.insert(userMsg);
        //查询当前用户，获得id一并发送给rabbit
        UserMsg userMsg1 = userLoginService.checkMail(userMsg.getUserMail());
        //向rabbit发送用户信息 用于发送邮件；
        rabbitTemplate.convertAndSend("sendMail",userMsg1);
    }

    //邮箱点击 激活用户
    @RequestMapping("/active/{id}")
    public String active(@PathVariable("id") Long id){
        //根据id获得当前用户信息修改状态
        UserMsg byPkId = userLoginService.findByPkId(id);
        byte i=1;//置为1 激活
        byPkId.setIsActivated(i);
        //根据id修改用户状态
        userLoginService.updateById(byPkId);

        return "激活成功，立即前往登陆";
    }



    /*
    * 登录
    * */

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody UserMsg userMsg){
        Subject subject = SecurityUtils.getSubject();
        //做邮箱和手机号的判断
        UserMsg userMsg1 = userLoginService.checkMail(userMsg.getUserMail());
        UserMsg userMsg2 = userLoginService.checkPhone(userMsg.getUserMail());
        byte i=1;//定义激活条件，用于byte类型的比较
        if(userMsg1!=null||userMsg2!=null){//根据任意一个条件查询不为空，则用户有效
            //判断身份是否与数据库匹配
            if(userMsg1!=null){//邮件登录情况

                if(userMsg1.getIdentity().equals(userMsg.getIdentity())&&userMsg1.getIsActivated()==i){//查询身份,判断是否激活
                    //使用邮件登录
                    //密码加密对比
                    String pass = Md5Utils.encryptPassword(userMsg.getUserPass(), userMsg1.getUserName());
                    //获得token
                    UsernamePasswordToken token = new UsernamePasswordToken(userMsg1.getUserMail(),pass);
                    //shiro登录
                    subject.login(token);
                    return "登录成功，欢迎您！";
                }
            }
            else if(userMsg2!=null){//手机号码登录情况
                if(userMsg2.getIdentity().equals(userMsg.getIdentity())&&userMsg1.getIsActivated()==i){
                    //使用手机号登录
                    String password = Md5Utils.encryptPassword(userMsg.getUserPass(), userMsg2.getUserName());
                    UsernamePasswordToken token = new UsernamePasswordToken(userMsg2.getUserPhone(), password);
                    subject.login(token);
                    return "登录成功，欢迎您！";
                }
            }
        }
        return "登录信息有误，请重试！";
    }


}
