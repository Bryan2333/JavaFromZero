package com.abstract_.exercise;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.printf("普通员工%s工作中.....\n", getName());
    }
}
