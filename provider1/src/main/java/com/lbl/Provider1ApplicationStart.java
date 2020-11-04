package com.lbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lbl.mapper")
public class Provider1ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(Provider1ApplicationStart.class);
        System.out.println("提供者1启动了");
    }

}
