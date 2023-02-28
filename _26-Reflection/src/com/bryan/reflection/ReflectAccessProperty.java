package com.bryan.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectAccessProperty {
    public static void main(String[] args) throws Exception {
        Class<?> stuClass = Class.forName("com.bryan.reflection.Student");

        Constructor<?> constructor = stuClass.getDeclaredConstructor();
        Student stu1 = (Student) constructor.newInstance();

        Field age = stuClass.getDeclaredField("age");
        age.set(stu1, 24);
        System.out.println(stu1);

        System.out.println("stu1.age = " + age.get(stu1));

        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(null, "李荣");
        System.out.println(stu1);

        System.out.println(name.get(null));
    }
}

class Student {
    public int age;
    private static String name;

    public Student() {}

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student {" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
