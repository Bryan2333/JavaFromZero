package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Exercise01 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/mysql.properties"));

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql1 = """
                create table news(
                    id int not null primary key auto_increment,
                    content longtext
                ) charset UTF8;
                """;

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql1);

        for (int i = 1; i <= 5; i++) {
            String sql = "insert into news value(%d, '第%d条新闻')".formatted(i, i);
            statement.executeUpdate(sql);
        }

        String sql3 = "update news set content='新的消息' where id = 1";
        statement.executeUpdate(sql3);

        String sql4 = "delete from news where id = 3";
        statement.executeUpdate(sql4);

        statement.close();
        connection.close();
    }
}
