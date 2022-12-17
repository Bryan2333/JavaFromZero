package com.outputstream;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;

    private static String nation;
    private transient double salary;

    // Company 类型也必须要实现序列化接口
    private final Company company = new Company("Github");

    @Serial
    private static final long serialVersionUID = 1L;
    public Employee(String name, int age, String nation, double salary) {
        this.name = name;
        this.age = age;
        Employee.nation = nation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "姓名: %s, 年龄: %d, 国籍: %s, 薪资: %.2f, 公司: %s".formatted(name, age, nation, salary, company);
    }
}
