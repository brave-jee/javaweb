package com.oracle.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    //http://localhost:8080/zhangchaoyang/index

    @RequestMapping("/home")
    public String home(){
        return "index";
    }

    @RequestMapping("loginView")
    public String  loginView(){
        return "login";
    }
}
