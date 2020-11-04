package com.lbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplicationStart.class,args);
        System.out.println("eureka server 已启动");
    }
}
