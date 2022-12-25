package com.wrapper;

public class Integer01 {
    public static void main(String[] args) {

        //手动装箱、拆箱
        int n1 = 100;
        Integer integer1 = Integer.valueOf(n1); // int -> Integer
        int n2 = integer1.intValue(); //Integer -> int

        //自动装箱、拆箱
        int n3 = 200;
        Integer integer2 = n3;
        int n4 = integer2;
    }
}
