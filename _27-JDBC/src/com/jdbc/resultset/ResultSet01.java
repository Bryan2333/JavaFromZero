package com.jdbc.resultset;

import java.sql.*;
/*
*   1. ResultSet表示数据库结果集的数据表
*   2. ResultSet对象持有一个光标指向当前行，起始位置的第一行之前
*   3. ResultSet有 next 放放将光标下移一行，当没有更多行可以返回时，则返回 false
*
*/

public class ResultSet01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String user = "bryan";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        String sql = "select * from actor";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt(1); //获取第一行数据
            String name = resultSet.getString(2); //获取第二行数据
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}


