package com.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        Map map = new HashMap();
        Employee emp1 = new Employee("张三", 12000, 1);
        Employee emp2 = new Employee("李四", 6000, 2);
        Employee emp3 = new Employee("王五", 20000, 3);

        map.put(emp1.getId(), emp1);
        map.put(emp2.getId(), emp2);
        map.put(emp3.getId(), emp3);

        //keySet遍历
        Set set = map.keySet();
        for (Object key : set) {
            Employee emp = (Employee) map.get(key);
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }
        System.out.println();

        //利用entrySet
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry mEntry = (Map.Entry) entry;
            Employee emp = (Employee) mEntry.getValue();
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return String.format("姓名：%s, 工资：%.1f", name, salary);
    }
}
