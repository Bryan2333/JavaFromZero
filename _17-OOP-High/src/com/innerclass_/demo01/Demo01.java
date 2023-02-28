package com.innerclass_.demo01;

public class Demo01 {
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 100;

    public void m1() {
        System.out.println("m1()");
    }

    {
        System.out.println("代码块");
    }

    class Inner {
        public void sayHello() {
            System.out.println("Hello!");
        }
    }
}

