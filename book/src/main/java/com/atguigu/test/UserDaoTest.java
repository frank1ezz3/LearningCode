package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
//根据用户名查询用户信息
    @Test
    public void queryUserByUsername() {

        if(userDao.queryUserByUsername("admin")==null){
            System.out.println("用户名可用！");
        }else{
            System.out.println("用户名已存在");
        }
    }
//根据 用户名和密码查询用户信息
    @Test
    public void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUsernameAndPassword("admin","admin")==null){
            System.out.println("你输的什么鸟密码？");
        }else{
            System.out.println("查询成功");
        }
    }
//保存用户信息,数据库可以检查 SELECT * FROM t_user;
    @Test
    public void saveUser() {
        System.out.println( userDao.saveUser(new User(null,"wzg168","123456","wzg168@qq.com")));
    }
}