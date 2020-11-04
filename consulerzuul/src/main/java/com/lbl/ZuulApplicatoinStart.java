package com.lbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
/* 启动网关访问服务  启动后所有注册到eureka的服务都可以直接用 ip:端口/服务名/ 访问  */

public class ZuulApplicatoinStart {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplicatoinStart.class,args);
    }
}
