package com.jdbc.statement;

import java.sql.*;
import java.util.Scanner;

/*
*   1. 不用再拼接SQL语句
*
*
* */
@SuppressWarnings("all")
public class PreparedStatement01 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //让用户输入用户名
        System.out.print("请输入管理员用户名: ");
        String adminName = scanner.nextLine();

        System.out.print("请输入管理员密码: ");
        String adminPwd = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String user = "bryan";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "SELECT name, pwd FROM admin WHERE name = ? AND pwd = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString (1, adminName); // 设置第一个问号的参数
        preparedStatement.setString(2, adminPwd);


        // 执行select语句使用executeQuery
        // 执行dml语句使用executeUpdate
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
