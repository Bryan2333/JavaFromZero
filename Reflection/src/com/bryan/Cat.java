package com.bryan;

public class Cat {
    private String name = "Tom";

    public int age = 5;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {}

    public void hi() {
        //System.out.println("hi " + name);
    }

    public void cry() {
        System.out.println("cry " + name);
    }

    public String toString() {
        return "name=%s, age=%d".formatted(name, age);
    }
}
