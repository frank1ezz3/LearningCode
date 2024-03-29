package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest //加载项目的ApplicationContext上下文

@AutoConfigureMockMvc //需引入@AutoConfigureMockMvc，利用MockMvc进行测试
class HelloControllerTest {

    @Autowired
    MockMvc mvc;
    @Test
    void index() {
        try{
            mvc.perform(MockMvcRequestBuilders.get("/")) //helloController.index();

                    .andExpect(MockMvcResultMatchers.status().isOk());
        }catch(Exception e){

        }
    }
}