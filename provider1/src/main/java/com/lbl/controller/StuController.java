package com.lbl.controller;


import com.lbl.Stu;
import com.lbl.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lbl
 * @since 2020-07-17
 */
@RestController
@RequestMapping("/stu")
public class StuController {

    @Autowired
    IStuService iStuService;

    @RequestMapping("list")
    public List<Stu> list(){
        System.out.println(123123);
        return iStuService.list();
    }

}

