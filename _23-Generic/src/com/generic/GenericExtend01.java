package com.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExtend01 {
    public static void main(String[] args) {
        // List<Object> list = new ArrayList<String>(); //因为泛型没有继承，这样写时错的
        List<Object> objects = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<A> as = new ArrayList<>();
        List<B> bs = new ArrayList<>();
        List<C> cs = new ArrayList<>();

        //printCollection1中的list泛型支持任意泛型
        printCollection1(objects); //T
        printCollection1(strings); //T
        printCollection1(as); //T
        printCollection1(bs); //T
        printCollection1(cs); //T

        //printCollection2中的list泛型支持A类和A的父类
        printCollection2(objects); //T
     //   printCollection2(strings); //F
        printCollection2(as); //T
     //   printCollection2(bs); //F
     //   printCollection2(cs); //F

        //printCollection3中的list泛型支持A类和A的子类
       // printCollection3(objects); //F
       // printCollection3(strings); //F
        printCollection3(as); //T
        printCollection3(bs); //T
        printCollection3(cs); //T

    }

    //支持任意泛型
    public static void printCollection1(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //支持A类和A的父类，不限于直接父类，规定了泛型的下线
    public static void printCollection2(List<? super A> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //表示支持A和A的子类，规定了泛型的上限
    public static void printCollection3(List<? extends A> list) {
        for (A a : list) {
            System.out.println(a);
        }
    }
}

class A{

}

class B extends A {

}

class C extends B {

}