package com.codeblock;

public class Demo04 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}

class AAA {
    private static int n1 = getVal01();

    static {
        System.out.println("AAA类的一个静态代码块"); // (2)
    }

    {
        System.out.println("AAA类的一个普通代码块"); // (5)
    }

    public int n3 = getVal02();

    public static int getVal01() {
        System.out.println("getVal01"); // (1)
        return 100;
    }

    public int getVal02() {
        System.out.println("getVal02"); // (6)
        return 200;
    }

    public AAA() {
        System.out.println("AAA类的构造器被调用"); // (7)
    }
}

class BBB extends AAA {
    private static int n3 = getVal03();

    static {
        System.out.println("BBB类的一个静态代码块"); // (4)
    }

    public int n4 = getVal04();

    {
        System.out.println("BBB类的一个普通代码块"); // (8)
    }

    public static int getVal03() {
        System.out.println("getVal03"); // (3)
        return 300;
    }

    public int getVal04() {
        System.out.println("getVal04"); // (9)
        return 400;
    }

    public BBB() {
        System.out.println("BBB类的构造器被调用"); // (10)
    }
}