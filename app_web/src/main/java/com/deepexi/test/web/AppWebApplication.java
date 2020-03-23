package com.deepexi.test.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName AppWebApplication
 * @Description: TODO
 * @Author mowenxun
 * @Date 2020/3/18
 * @Version V1.0
 **/
@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
public class AppWebApplication {
    public static void main(String[] args) {
        try {

            SpringApplication.run(AppWebApplication.class, args);
            System.out.println("====================启动完成=======================");
        } catch (Exception e) {
            System.out.println("启动报错==" + e.getMessage());
            e.printStackTrace();
        }
    }
}
