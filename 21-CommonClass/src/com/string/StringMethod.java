package com.string;

public class StringMethod {
    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = "hello, world!";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.length()); //输出13

        System.out.println(str1.indexOf('o')); //输出4
        System.out.println(str1.lastIndexOf('o')); //输出

        System.out.println(str1.substring(7)); //输出 World!
        System.out.println(str1.substring(1, 8)); //输出ello, W

        System.out.println(str1.toUpperCase()); //输出HELLO, WORLD!
        System.out.println(str1.toLowerCase()); //输出hello, world!

        System.out.println(str1.concat(str2)); //输出Hello, World!hello, world!

        System.out.println(str1.replace("World", "Java")); //输出 Hello, Java!

        String str3 = "abc def ghi";
        String[] strArray = str3.split(" "); //根据空格分割字符串
        for (String i : strArray) { //每行分别输出abc def ghi
            System.out.println(i);
        }

        String str4 = String.format("%s %c %d %f", "Hello", 'a', 100, 0.5);
        System.out.println(str4); //输出：Hello a 100 0.5
    }
}