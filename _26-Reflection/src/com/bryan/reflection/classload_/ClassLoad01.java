package com.bryan.reflection.classload_;

public class ClassLoad01 {
    public static void main(String[] args) {
        new A();
    }
}
class A {
    /*
    * n1 是 实例 属性，不会在准备阶段初始化
    * n2 是 类   属性，分配内存 n2 是默认初始化 0 ，而不是 20
    * */
    public int n1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;
}
