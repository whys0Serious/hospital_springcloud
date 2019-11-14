package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/5
 * \* Time: 15:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@SpringBootApplication //springboot的工程启动类
@EnableDiscoveryClient  //eureka的客户端
@EnableFeignClients //相互调用
@EnableCircuitBreaker  //事务的熔断降级
public class EsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class);
    }
}