package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

@SuppressWarnings("all")
public class PreparedStatement02 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入删除的管理员用户名: ");
        String adminName = scanner.nextLine();

//        System.out.print("请输入添加的管理员密码: ");
//        String adminPwd = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String user = "bryan";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);

        // insert语句
        // String sql = "INSERT INTO admin VALUES (?, ?)";

        // update语句
        // String sql = "UPDATE admin SET pwd = ? WHERE name = ?";

        // delete语句
        String sql = "DELETE FROM admin WHERE name = ?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString (1, adminName); 
//        preparedStatement.setString(1, adminPwd);

        int row = preparedStatement.executeUpdate();

        System.out.println(row > 0 ? "成功" : "失败");

        preparedStatement.close();
        connection.close();
    }
}
