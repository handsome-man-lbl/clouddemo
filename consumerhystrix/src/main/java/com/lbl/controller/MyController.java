package com.lbl.controller;

import com.lbl.Stu;
import com.lbl.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/*
* 第一种熔断方法
*  1 创建UserService服务的实现类
*  2 实现类加@Component注解
*  3 UserService服务接口加注解：@FeignClient(name="eureka-client-provider",fallback = UserServiceFallbackImpl.class )
*
* 第二种熔断方法
*  1 在控制层做熔断 熔断执行的方法
*  2 在要加熔断的控制类上写注解  @HystrixCommand(fallbackMethod = "stulistfallback")
*  3 第一种方法优先于第二种 所以要注释点第一种的两个注解
*
* */
@RestController
public class MyController {


    /* 使用restTemplate方式调用服务  */
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("get")
    public String get1(){
        System.out.println(123213123);
        String forObject = restTemplate.getForObject("http://eureka-client-provider/get?id=123", String.class);

        return forObject;
    }


/*使用Feign调用方式 */
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
    @HystrixCommand(fallbackMethod = "stulistfallback")
    public List<Stu> stulist(){
        return userService.stulist();
    };

    public List<Stu> stulistfallback(){

        System.out.println("第二种熔断测试");
        return null;
    };



}
