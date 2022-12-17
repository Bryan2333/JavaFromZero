package com.interface_.datebaseDemo;

public class MariaDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接Mariadb");
    }

    @Override
    public void close() {
        System.out.println("关闭连接");
    }
}
