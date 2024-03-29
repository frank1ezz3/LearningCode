package com.atguigu.dao.impl;

import com.atguigu.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public abstract class BaseDao {//给别复用（继承）的代码的，不需要对象实例



    //使用Dbutils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * update()方法来执行：insert、update、Delete语句（增删改）
     * @return 如果返回-1，说明执行失败   返回其他表示影响的行数
     */
    public int update(String sql,Object ... args){



        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
//        finally{
//            JdbcUtils.close(connection);//做这些操作完了之后得关闭吧，不然数据库炸了
//        }
//        return -1;
    }

    /**
     *                   查询返回一个javaBean的sql语句
     * @param type       返回的对象类型
     * @param sql        执行的sql语句
     * @param args       sql对应的参数值
     * @param <T>        返回的类型的泛型
     * @return
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
//        finally{
//            JdbcUtils.close(con);//做这些操作完了之后得关闭吧，不然数据库炸了
//        }
//        return null;
    }

    /**
     *                   查询返回多个javaBean的sql语句
     * @param type       返回的对象类型
     * @param sql        执行的sql语句
     * @param args       sql对应的参数值
     * @param <T>        返回的类型的泛型
     * @return
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanListHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
//        finally{
//            JdbcUtils.close(con);//做这些操作完了之后得关闭吧，不然数据库炸了
//        }
//        return null;
    }

    /**
     *                   执行返回一行一列的sql语句
     * @param sql        执行的sql语句
     * @param args       sql对应的参数值
     * @return
     */
    public Object queryForSingleValue(String sql, Object... args){

        Connection conn = JdbcUtils.getConnection();

        try {
            return queryRunner.query(conn, sql, new ScalarHandler(), args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
//        finally{
//            JdbcUtils.close(conn);//做这些操作完了之后得关闭吧，不然数据库炸了
//        }
//        return null;
    }

}
