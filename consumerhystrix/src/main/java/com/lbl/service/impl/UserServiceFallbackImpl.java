package com.lbl.service.impl;

import com.lbl.Stu;
import com.lbl.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// 服务熔断调用实现类

@Component
public class UserServiceFallbackImpl implements UserService {

    @Override
    public String get(Integer id) {
        System.out.println("熔断状态");
        return id+"get 没找到";
    }

    @Override
    public String list() {
        System.out.println("熔断状态");
        return "list没找到";
    }

    @Override
    public List<Stu> stulist() {
        System.out.println("熔断状态");
        return null;
    }
}
