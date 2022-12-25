package com.generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 8000, new MyData(1995, 12, 11)));
        employees.add(new Employee("jack", 12000, new MyData(1988, 5, 13)));
        employees.add(new Employee("jack", 15000, new MyData(1988, 5, 23)));

        System.out.println("=======排序前======");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }

                //下面是对birthday的比较，应该将该比较放到MyData类
                //如果Name相同就比较生日年份
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println("======排序后======");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private MyData birthday;

    public Employee(String name, double price, MyData birthday) {
        this.name = name;
        this.salary = price;
        this.birthday = birthday;
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

    public MyData getBirthday() {
        return birthday;
    }

    public void setBirthday(MyData birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名: %s, 薪资: %.2f, 生日: %s".formatted(name, salary, birthday);
    }
}

class MyData implements Comparable<MyData>{
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "%d年%d月%d日".formatted(year, month, day);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyData myData)) {
            return false;
        }

        return myData.getYear() == year && myData.getMonth() == month && myData.getDay() == day;
    }

    @Override
    //对生日进行比较
    public int compareTo(MyData o) {
        int yearDiff = year - o.getYear();
        if (yearDiff != 0) {
            return yearDiff;
        }

        //如果生日年份相同就比较month
        int monthDiff = month - o.getMonth();
        if (monthDiff != 0) {
            return monthDiff;
        }

        int dayDiff = day - o.getDay();
        return dayDiff;
    }
}
