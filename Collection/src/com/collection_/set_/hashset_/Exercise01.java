package com.collection_.set_.hashset_;

import java.util.HashSet;
import java.util.Objects;

public class Exercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Employee smith = new Employee("Smith", 35);
        Employee peter = new Employee("Peter", 37);
        Employee tim = new Employee("Smith", 35);

        hashSet.add(smith);
        hashSet.add(peter);
        hashSet.add(tim);

        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}