package com.lbl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("get")
    public String get(@RequestParam("id") Integer id){
        return "111："+id;
    }

    @RequestMapping("list")
    public List<String> list(){
        ArrayList<String> s = new ArrayList<>();
        s.add("123");
        s.add("456");
        return s;
    }

}
