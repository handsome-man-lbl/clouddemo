package com.lbl.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {


    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){

        return new RestTemplate();
    }

    /** 配置负载均衡算法 **/
    @Bean
    public IRule iRule(){
        /** 随机选取一个服务，进行访问 **/
        return new RandomRule();
        //return new RoundRobinRule();
    }
}
