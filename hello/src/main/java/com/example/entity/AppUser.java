package com.example.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;
@Component  //将AppUser实例化并注入Spring的IoC容器中
public class AppUser { //注入默认名为appUser
    @Value("${appuser.id}") //@Value将配置文件中的属性值注入到相应属性中
    Integer id;
    @Value("${appuser.name}")
    String name;
    @Value("${appuser.password}")
    String password;
    @Value("${appuser.skills}")
    List<String> skills;
    @Override
    public String toString() { //用于测试：显示输出属性值
        return "AppUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", skills=" + skills +
                '}';
    }
}