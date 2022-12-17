package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Exercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection dogs = new ArrayList();
        dogs.add(new Dog("大黑", 3));
        dogs.add(new Dog("大黄", 5));
        dogs.add(new Dog("大壮", 6));

        Iterator iterator = dogs.iterator();
        System.out.println("====使用迭代器遍历集合====");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("\n====使用增强for循环遍历集合");
        for (Object dog : dogs) {
            System.out.println(dog);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}