package com.string;

public class StringDetail {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println(str1 == str2);

        String str3 = new String("Hello, World!");
        System.out.println(str3.intern());

        String a = "Hello" + "World!";
        System.out.println(a);
    }
}
