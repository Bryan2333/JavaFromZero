package com.generic.custom;

import java.util.ArrayList;

public class CustomMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("Hello, World!");

        Fish<String, Integer> fish = new Fish<>();
        fish.eat("Java", 200.5);

        Fish<Integer, ArrayList<Integer>> fish2 = new Fish<>();

    }
}

class Car {
    public void run() {

    }

    public <K> void fly(K k) {
        System.out.println(k);
    }
}

class Fish<T, R> {
    public void run() {

    }

    public <U, M> void eat(U u, M m) {
        System.out.println(u);
        System.out.println(m);
        System.out.println(m.getClass());
    }
}
