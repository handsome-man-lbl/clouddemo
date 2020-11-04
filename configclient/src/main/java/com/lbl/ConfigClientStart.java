package com.lbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.security.krb5.Config;

@SpringBootApplication
public class ConfigClientStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientStart.class);
        System.out.println("配置中心客户端启动了");
    }
}
