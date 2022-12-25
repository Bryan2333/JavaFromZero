package com.string_builder;

public class StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, World!");
        stringBuilder.append(" ");
        stringBuilder.append("Hello, Java!");

        System.out.println(stringBuilder);
    }
}
