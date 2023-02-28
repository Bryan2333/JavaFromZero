package com.string;

public class StringDetail02 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("abc");
        System.out.println(sb);
        String c = sb.toString();
        System.out.println(c);


    }
}
