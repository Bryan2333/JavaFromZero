package com.innerclass_.annoymous_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.m1();

        Demo demo = new Demo();
        demo.m1();
    }
}

interface IA {
    void sayHello();
}

class Person {
    public void m1() {
        IA jack = new IA() {
            public void sayHello() {
                System.out.println("Hello!");
            }
        };
        jack.sayHello();

        new IA() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        }.sayHello();
    }
}

class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Animal is eating!");
    }
}

class Demo {

    public void m1() {
        //第一种使用方式
        Animal animal = new Animal("Dog") {
            @Override
            public void eat() {
                System.out.println(getName() + " is eating!");
            }
        };
        animal.eat();
//        System.out.println(animal.getClass());

        //第二种使用方式
        new Animal("Dog") {
            @Override
            public void eat() {
                System.out.println(getName() + " is eating!");
            }
        }.eat();
    }
}
