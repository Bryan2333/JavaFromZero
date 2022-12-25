package com.bryan.reflection.class_;

import com.bryan.Cat;
import com.bryan.Dog;

public class Class01 {
    public static void main(String[] args) throws Exception {


        Cat cat = new Cat();
        Class<?> cls1 = Class.forName("com.bryan.Cat");
        Class<?> cls2 = Class.forName("com.bryan.Cat");
        Class<?> cls3 = Class.forName("com.bryan.Dog");
        System.out.println(cls1 == cls2);
        System.out.println("cls1.hashcode=" + cls1.hashCode());
        System.out.println("cls2.hashcode=" + cls2.hashCode());
        System.out.println("cls3.hashcode=" + cls3.hashCode());

    }
}
