/*
*  JDBC 连接数据库的五种方式
* */

package com.jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConn {
    public static void main(String[] args) {

    }

    @Test
    public void method01() throws SQLException {
        Driver driver = new Driver(); // 准备 driver

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        Properties info = new Properties();
        info.setProperty("user", "bryan");
        info.setProperty("password", "password");

        // Connect 可以理解为网络连接
        Connection connection = driver.connect(url, info);
        System.out.println(connection);
        // 关闭连接
        connection.close();
    }

    @Test
    public void method02() throws Exception {
        // 使用反射加载 Driver 类
        // 动态加载更加灵活，减少依赖性
        Class<?> driverClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) driverClass.getConstructor().newInstance();

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        Properties info = new Properties();
        info.setProperty("user", "bryan");
        info.setProperty("password", "password");

        // Connect 可以理解为网络连接
        Connection connection = driver.connect(url, info);
        System.out.println("连接方式2 = " + connection);
    }

    @Test
    public void method03() throws Exception {
        // 使用反射加载类
        Class<?> driverClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) driverClass.getConstructor().newInstance();

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String user = "bryan";
        String password = "password";

        DriverManager.registerDriver(driver); // 注册 Driver 驱动

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("第三种方式 = " + connection);
    }

    @Test
    public void method04() throws Exception {
        // 使用 Class.forName 完成驱动注册，简化代码
        // Driver 有静态代码块自动注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String user = "bryan";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第四种方法 = " + connection);
    }

    @Test
    public void method04_2() throws SQLException {

        // Java 从 jdk1.5以后使用了 JDBC 4，不需要再显示调用 Class.forName 注册驱动

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String user = "bryan";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第四种方法(优化) = " + connection);
    }

    // 在第四种方式的基础上，增加配置文件，让连接 Mysql 更加灵活
    @Test
    public void method05() throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/mysql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("第五种方法 = " + connection);

    }
}
