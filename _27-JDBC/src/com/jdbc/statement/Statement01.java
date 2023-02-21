package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
*   Statement 一般不用，因为它无法防范SQL注入
*
* */

public class Statement01 {
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

        Statement statement = connection.createStatement();

        String sql = "SELECT name, pwd FROM admin WHERE name = '" + adminName + "' AND pwd = '" + adminPwd + "'";

        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            System.out.println("恭喜你登陆成功");
        } else {
            System.out.println("登陆失败");
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
