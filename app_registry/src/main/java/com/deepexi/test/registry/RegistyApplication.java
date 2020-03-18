package com.deepexi.test.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName RegistyApplication
 * @Description: TODO
 * @Author mowenxun
 * @Date 2020/3/17
 * @Version V1.0
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableEurekaServer
public class RegistyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistyApplication.class, args);
    }
}
