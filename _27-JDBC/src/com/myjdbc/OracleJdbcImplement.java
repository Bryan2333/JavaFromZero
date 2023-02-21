package com.myjdbc;

public class OracleJdbcImplement implements JdbcInterface{
    @Override
    public Object getConnect() {
        System.out.println("成功连接到 Oracle 数据库 升级");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 Oracle 增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 Oracle 数据库连接");
    }
}
