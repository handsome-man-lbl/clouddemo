package com.lbl.controller;

import com.lbl.Stu;
import com.lbl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MyController {


    @Autowired
    RestTemplate restTemplate;

    /*使用ribbon的RestTemplate调用（负载均衡算法写在RebbonConfig类中）
    *  加了 @LoadBalanced 注解后  可以用服务名来调用 而提供者有多个 服务名相同 达到负载均衡的效果  如果直接通过ip+端口调用  知识调用单个服务
    * */
    @RequestMapping("get")
    public String get1(){
        System.out.println(123213123);
        String forObject = restTemplate.getForObject("http://eureka-client-provider/get?id=123", String.class);
        return forObject;
    }


    /*使用Feign调用  */
    @Autowired
    UserService userService;

    @RequestMapping("get2")
    public String get2(@RequestParam("id") Integer id){
        String s = userService.get(id);
        return s;
    }


    @RequestMapping("list")
    public String list(){
        String s = userService.list();
        return s;
    }

    @RequestMapping("/stu/list")
    public List<Stu> stulist(){
        return userService.stulist();
    };

}
