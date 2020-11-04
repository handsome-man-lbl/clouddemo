package com.lbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationStart.class);
        System.out.println("消费者启动了");
    }

}
