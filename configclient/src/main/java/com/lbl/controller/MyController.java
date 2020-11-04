package com.lbl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${mykey}")
    private String mykey;

    @RequestMapping("get")
    public String get(){
        return mykey;
    }
}
