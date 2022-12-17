package com.myjdbc;

public class TestJdbc {
    public static void main(String[] args) {
        // 通过接口引用实现类
        JdbcInterface mysqlJdbc = new MysqlJdbcImplement();

        mysqlJdbc.getConnect();
        mysqlJdbc.crud();
        mysqlJdbc.close();
        System.out.println("======================");

        JdbcInterface oracleJdbc = new OracleJdbcImplement();
        oracleJdbc.getConnect();
        oracleJdbc.crud();
        oracleJdbc.close();
    }
}
