package com.atguigu.test;


import com.atguigu.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {//测试jdbc能不能连接上

    @Test
    public void testJdbcUtils(){       //这里如果不释放的话，只能获取到最大连接数的值，一旦释放就可以想获取几个就有几个
        for(int i =0;i<100;i++){
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
//            JdbcUtils.close(connection);
        }

    }
}
