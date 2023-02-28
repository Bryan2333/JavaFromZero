package com.myjdbc;

public class MysqlJdbcImplement implements JdbcInterface{
    @Override
    public Object getConnect() {
        System.out.println("成功连接到 MySQL 数据库");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 MySQL 增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 MySQL 数据库连接");
    }
}
