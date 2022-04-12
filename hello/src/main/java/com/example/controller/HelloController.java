package com.example.controller;

import com.example.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController //标识控制类，内写方法回应http请求

public class HelloController {
    @Autowired
    AppUser appuser;

    @RequestMapping("/index.html") //请求项目根"/"即访问本方法

    public String index(){
        System.out.println("hello");

        return "Hello";

    }
    @GetMapping("/appuser")
    public String getAppuserInfo(){
        return appuser.toString();
    }
}