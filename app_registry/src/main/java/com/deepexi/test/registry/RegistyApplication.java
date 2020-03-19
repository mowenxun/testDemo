package com.deepexi.test.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName RegistyApplication
 * @Description: TODO
 * @Author mowenxun
 * @Date 2020/3/17
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegistyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistyApplication.class, args);
    }
}
