package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Sprnig Boot核心注解“主程序启动类”

public class App { //SpringBoot项目主程序启动类

  public static void main(String[] args) {

    SpringApplication.run(App.class); //实例化spring容器,因依赖start-web会启动Tomcat

  }

}