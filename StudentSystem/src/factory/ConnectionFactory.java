package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

    String connectionUrl = "jdbc:mysql://localhost:3306/java_b2";
    String dbUser = "bryan";
    String dbPwd = "www.bilibili.com";
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