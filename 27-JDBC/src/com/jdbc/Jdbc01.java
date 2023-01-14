package com.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {

        // 1. 注册驱动
        Driver driver = new Driver();

        // 2. 得到连接
        // jdbc:mysql 规定好协议，使用 jdbc 连接 mysql
        // 127.0.0.1 数据库主机的ip地址
        // 3306 端口号
        // jdbc_learning 要连接到的数据库名称
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learning";

        // 将 用户名 和 密码 放到一个 Properties 对象
        Properties info = new Properties();
        info.setProperty("user", "bryan");
        info.setProperty("password", "www.bilibili.com");

        // Connect 可以理解为网络连接
        Connection connection = driver.connect(url, info);

        // 3. 执行 SQL 语句
        String sql = "insert into actor values(null, '张三', '男', '2077-12-12', '111')";
        // String sql = "update actor set name='周星驰' where id = 1";
        // String sql = "delete from actor where id = 1";

        // 用于执行静态 SQL 语句并返回其生产的结果的对象
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "成功" : "失败");

        // 4. 关闭连接
        statement.close();
        connection.close();

    }
}
