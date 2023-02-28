package com.bryan.reflection.classload_;

public class ClassLoad02 {
    public static void main(String[] args) {
        System.out.println(B.num);

        B b = new B();
    }
}

class B {
    static {
        System.out.println("B类的静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B() {
        System.out.println("B类的构造器被执行");
    }
}