package com.interface_.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        C c = new C();
        c.printX();
    }
}

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void printX() {
        System.out.println(super.x);
    }
}