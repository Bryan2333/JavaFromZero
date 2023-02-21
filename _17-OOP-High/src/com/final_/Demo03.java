package com.final_;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(TestB.n1);
    }
}

final class TestA {
    public void m1() {
        System.out.println("m1()");
    }
}

class TestB {
    public static final int n1 = 100;

    static {
        System.out.println("静态代码块被调用");
    }
}