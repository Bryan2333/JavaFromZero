package com.myjdbc;
/*
*   模拟 JDBC 接口
* */
public interface JdbcInterface {
    // 连接数据库
    public Object getConnect();

    // CRUD
    public void crud();

    // 关闭连接
    public void close();
}
