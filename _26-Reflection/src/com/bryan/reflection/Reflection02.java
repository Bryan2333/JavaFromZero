package com.bryan.reflection;

import com.bryan.Cat;

import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws Exception {

        m1();
        m2();
        m3();
    }

    //传统方式调用方法
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //反射机制调用方法
    public static void m2() throws Exception {
        Class<?> cls = Class.forName("com.bryan.Cat");
        Cat cat = (Cat) cls.getDeclaredConstructor().newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hi.invoke(cat);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //反射机制取消访问检查
    public static void m3() throws Exception {
        Class<?> cls = Class.forName("com.bryan.Cat");
        Cat cat = (Cat) cls.getDeclaredConstructor().newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(false);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hi.invoke(cat);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
