
package com.qf.config;

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

@Component
public class RabbitMailListener {

    @Value("${spring.mail.username}")
     private String  MAIL_SENDER;

    Logger logger=LoggerFactory.getLogger(RabbitMailListener.class);
    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private JavaMailSender javaMailSender;
    @RabbitListener(queues = "sendMail")
    public void sendMail(UserMsg userMsg){
        logger.info("收到注册信息："+userMsg);
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

            mimeMailMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom(MAIL_SENDER);
            mimeMessageHelper.setTo(userMsg.getUserMail());
            mimeMessageHelper.setSubject("健美医院账号激活邮件");

            mimeMessageHelper.setText(emailContent,true);
            javaMailSender.send(mimeMailMessage);//发送邮件
        } catch (Exception e) {
            logger.error("邮件发送失败", e.getMessage());
        }
    }
}

