package com.static_;

import java.util.Arrays;

public class ChildGame {
    public static void main(String[] args) {

        Child child1 = new Child("Smith");
        Child child2 = new Child("Peter");

        Child.sayHello();
        child1.sayHi();
        /*System.out.printf("9开平方 = %.0f\n", Math.sqrt(9));
        child1.join();
        child2.join();*/

//        System.out.println(Child.count);
    }
}

class Child {

    public static int count = 0;
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.printf("%s加入了游戏\n", this.name);
        count++;
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public void sayHi() {
        System.out.println("Hi!");
    }

    public static void sayName() {
        System.out.println();
    }
}
