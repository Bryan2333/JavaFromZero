package com.bryan.reflection;

import com.bryan.Cat;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader(".\\src\\re.properties"));
        String className = (String) properties.get("classPath");

        Class<?> cls = Class.forName(className);
        Cat cat = (Cat) cls.getDeclaredConstructor().newInstance();
        Field ageField = cls.getField("age");
        Constructor<?> constructor = cls.getDeclaredConstructor();
        Constructor<?> constructor1 = cls.getDeclaredConstructor(String.class);
        System.out.println(constructor);
        System.out.println(constructor1);

    }
}
