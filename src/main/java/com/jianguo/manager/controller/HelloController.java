package com.jianguo.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/11/16.
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public  String index(){
        return "welcome springBoot";
    }
}
