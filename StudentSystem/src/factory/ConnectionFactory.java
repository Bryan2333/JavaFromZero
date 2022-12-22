package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import studentsystem.StudentSystem;

public class ConnectionFactory {

    String connectionUrl = "jdbc:mariadb://127.0.0.1:23334/java_b2";
    String dbUser = "root";
    String dbPwd = "www.google.com";
    private static ConnectionFactory connectionFactory = null;


    public Connection getConnection() throws SQLException
    {
        Connection conn;
        conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
        return conn;
    }

    public static ConnectionFactory getInstance()
    {
        if (connectionFactory == null)
        {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }
}