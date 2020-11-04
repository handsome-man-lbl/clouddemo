package com.lbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/*
* 启动zk 启动kafka 启动Eureka注册好中心  启动configbusserver 再启动ConfigServerBusClient
* 试着修改github文件  通过启动configbusserver直接获取  能获取最新数据  通过再启动ConfigServerBusClient 获取 不是最新数据
* 访问 configbusserverip:端口/actuator/bus-refresh  通知configbusserver 的fakfa发送消息 给所有的ConfigServerBusClient的kafka
*  所有的ConfigServerBusClient获取最新消息
*
* */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigServerBusClient {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBusClient.class);
    }
}
