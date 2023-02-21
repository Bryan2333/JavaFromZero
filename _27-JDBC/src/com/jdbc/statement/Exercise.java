package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String user = "bryan";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "CREATE TABLE admin2(`name` VARCHAR(10), `pwd` VARCHAR(10))";

        PreparedStatement ps1 = connection.prepareStatement(sql);
        ps1.executeUpdate();

        HashMap<String, String> admin2 = new HashMap<>();
        admin2.put("test1", "123");
        admin2.put("test2", "123");
        admin2.put("test3", "123");
        admin2.put("tom", "123");
        admin2.put("test5", "123");


        Set<String> username = admin2.keySet();
        for (String s : username) {
            String sql2 = "insert into admin2 values (?, ?)";
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps2.setString(1, s);
            ps2.setString(2, admin2.get(s));
            ps2.executeUpdate();
            ps2.close();
        }

        sql = "UPDATE admin SET name = 'king' WHERE name = 'tom'";
        PreparedStatement ps5 = connection.prepareStatement(sql);
        ps5.executeUpdate();

        sql = "DELETE FROM admin2 WHERE name = 'test5'";
        PreparedStatement ps3 = connection.prepareStatement(sql);
        ps3.executeUpdate();

        sql = "SELECT * FROM admin2";
        PreparedStatement ps4 = connection.prepareStatement(sql);
        ResultSet resultSet = ps4.executeQuery();

        while (resultSet.next()) {
            System.out.println("username = " + resultSet.getString(1) + " pwd = " + resultSet.getString(2));
        }

        resultSet.close();
        ps1.close();
        ps3.close();
        ps4.close();
        ps5.close();
        connection.close();
    }
}
