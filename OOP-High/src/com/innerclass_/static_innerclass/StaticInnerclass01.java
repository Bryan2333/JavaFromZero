package com.innerclass_.static_innerclass;

public class StaticInnerclass01 {
    public static void main(String[] args) {
        Outer myOuter = new Outer();
        myOuter.m1();

        Outer.Inner myInner02 = new Outer.Inner();
        myInner02.print();

        Outer.Inner myInner03 = Outer.getInnerInstance();
        myInner03.print();
    }
}

class Outer {
    private int n1 = 100;
    private static String name = "张三";

    static class Inner {
        public void print() {
            System.out.println(name);
        }
    }

    public void m1() {
        Inner inner = new Inner();
        inner.print();
    }

    public static Inner getInnerInstance() {
        return new Inner();
    }
}
