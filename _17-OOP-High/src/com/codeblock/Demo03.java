package com.codeblock;

public class Demo03 {
    public static void main(String[] args) {

        A a = new A();
    }
}

class A {
    private static int n1 = getN1();

    private int n2 = getN2();

    {
        System.out.println("A类普通代码块");
    }

    static {
        System.out.println("A类静态代码块");
    }

    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

    //无参构造器
    public A() {
        System.out.println("A类的无参构造器被调用");
    }
}