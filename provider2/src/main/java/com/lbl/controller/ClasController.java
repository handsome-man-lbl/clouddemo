package com.lbl.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lbl
 * @since 2020-07-17
 */
@RestController
public class ClasController {

    @RequestMapping("get1")
    public String get1(){
        return "one";
    }

    @RequestMapping("/clas2/get2")
    public String get2(){
        return "two2";
    }

}

