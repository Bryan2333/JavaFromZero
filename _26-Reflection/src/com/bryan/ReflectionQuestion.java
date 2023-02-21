package com.bryan;

import com.bryan.Cat;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {

        // 传统方式
        /*Cat cat = new Cat();
        cat.hi();*/

        Properties properties = new Properties();
        properties.load(new FileReader(".\\src\\re.properties"));
        String classPath = (String) properties.get("classPath");
        String methodName = (String) properties.get("method");
        /*System.out.println(classPath);
        System.out.println(methodName);*/

        // 使用反射机制解决
        // 1. 加载类
        Class<?> cls = Class.forName(classPath);
        // 2. 通过 cls 得到加载的类
        Cat cat = (Cat) cls.getDeclaredConstructor().newInstance();
        // 在反射中，可以把方法看作一个对象
        Method method1 = cls.getMethod(methodName);
        // 通过方法对象来实现调用方法
        // 传统方法: 对象.方法()
        // 反射机制: 方法.invoke(对象)
        method1.invoke(cat);

    }
}
