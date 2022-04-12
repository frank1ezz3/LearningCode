package com.example;
import com.example.entity.AppUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    AppUser appUser;
    @Test
    void contextLoads() {
        System.out.println(appUser);
    }
}