package com.qf.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue mailQueue(){//初始化一个队列，传递发送邮件消息
        return new Queue("sendMessage");
    }
}
