package com.bryan.reflection;

import java.lang.reflect.Constructor;

public class ReflectCreateInstance {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("com.bryan.reflection.User");

        Object o = cls.getConstructor().newInstance();
        System.out.println(o);

        Constructor<?> constructor1 = cls.getDeclaredConstructor(String.class);
        Object o1 = constructor1.newInstance("李四");
        System.out.println(o1);

        Constructor<?> constructor2 = cls.getDeclaredConstructor(int.class, String.class);
        constructor2.setAccessible(true); // 爆破，即通过反射可以访问 private 构造器
        Object o3 = constructor2.newInstance(20, "王五");
        System.out.println(o3);
    }
}

class User {
    public int age = 22;

    public String name = "张三";

    public User() {}

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User {" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}