package com.string;

public class String01 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str.toCharArray()[0] = 'a';
        System.out.println(str);

        final char[] value = {'a', 'b', 'c'};
        value[0] = 'd';

    }
}
