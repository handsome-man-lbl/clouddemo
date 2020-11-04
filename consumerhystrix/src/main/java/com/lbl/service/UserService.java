package com.lbl.service;

import com.lbl.Stu;
import com.lbl.service.impl.UserServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/* 服务名称   这个接口类似一个代理   get方法就是服务的方法    */
@FeignClient(name="eureka-client-provider",fallback = UserServiceFallbackImpl.class )
public interface UserService {

    @RequestMapping("get")
    public String get(@RequestParam("id") Integer id);

    @RequestMapping("list")
    public String list();

    @RequestMapping("/stu/list")
    public List<Stu> stulist();

}
