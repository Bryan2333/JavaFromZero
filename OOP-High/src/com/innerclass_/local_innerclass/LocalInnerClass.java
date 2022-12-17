package com.innerclass_.local_innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
    }
}

class Outer {
    private int n1 = 100;
    private int n2 = 200;

    private void m2() {
        System.out.println("m2()");
    }

    public void m1() {
        class Inner {
            public int n2 = 300;
            public void f1() {
                System.out.println("n1 = " + n1); //局部内部类访问外部类私有字段
                m2(); //局部内部类访问外部类私有方法
            }
            // 如果需要访问外部类的成员，则使用 外部类.this.成员 来访问
            public void f2() {
                System.out.println("外部类的n2 = " + Outer.this.n2);
            }
        }

        Inner inner = new Inner();
        inner.f1();
        inner.f2();
    }
}
