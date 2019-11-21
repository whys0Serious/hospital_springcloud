
package com.qf.config;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.qf.dao.UserMsgMapper;
import com.qf.domain.UserMsg;
import com.qf.domain.UserOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.util.Random;

@Component
public class RabbitMailListener {

    @Value("${spring.mail.username}")
    private String MAIL_SENDER;

    Logger logger = LoggerFactory.getLogger(RabbitMailListener.class);
    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private JavaMailSender javaMailSender;

    @RabbitListener(queues = "sendMail")
    public void sendMail(UserMsg userMsg) {
        logger.info("收到注册信息：" + userMsg);
        //创建邮件正文
        Context context = new Context();
        //为thymeleaf携带参数 id
        context.setVariable("id", userMsg.getPkUid());
        String emailContent = templateEngine.process("emailTemplate", context);

        MimeMessage mimeMailMessage = null;
        try {
            /*
             * 设置邮件信息
             */
//            * 设置邮件信息
//            *

            mimeMailMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom(MAIL_SENDER);
            mimeMessageHelper.setTo(userMsg.getUserMail());
            mimeMessageHelper.setSubject("健美医院账号激活邮件");

            mimeMessageHelper.setText(emailContent, true);
            javaMailSender.send(mimeMailMessage);//发送邮件
        } catch (Exception e) {
            logger.error("邮件发送失败", e.getMessage());
        }
    }

    @Autowired
    private UserMsgMapper userMsgMapper;

    //监听叫号
    @RabbitListener(queues = "sendMessage")
    public void sendMessage(UserOrder userOrder) {
        //得到信息后，发送短信
        //查询用户信息
        UserMsg userMsg = userMsgMapper.selectByPrimaryKey(userOrder.getUserId());
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FcdTxMDoNMgoakQTMc2", "NmQPOnyu9JdS1QjlNSl691zBRQDXsh");
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        //用户手机号码
        request.putQueryParameter("PhoneNumbers", userMsg.getUserPhone());
        request.putQueryParameter("SignName", "健康门诊");
        request.putQueryParameter("TemplateCode", "SMS_177539255");
        String code=getCode();
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        System.out.println("发送短信：" + userMsg.getUserName()+userMsg.getUserPhone());
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

        public String getCode(){
            StringBuffer stringBuffer = new StringBuffer();
            Random random = new Random();
            for (int i = 0; i <6 ; i++) {
               int s= random.nextInt(9);
                stringBuffer.append(s);
            }
            return stringBuffer.toString();
    }
}

