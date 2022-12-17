package com.interface_.demo02;

public class Interface02 {
    public static void main(String[] args) {

    }
}

class A implements AInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}