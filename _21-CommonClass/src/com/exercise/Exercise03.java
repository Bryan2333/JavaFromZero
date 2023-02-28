package com.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        String str = "test test test";
        printName(str);
    }

    public static void printName(String str) {

        if (str == null) {
            System.out.println("str不能为空");
            return;
        }
        String[] strings = str.split(" ");
        if (strings.length != 3) {
            System.out.println("字符串格数不正确！XXX XXX XXX");
        }
        String formatName = String.format("%s,%s .%c", strings[2], strings[0], strings[1].toUpperCase().charAt(0));
        System.out.println(formatName);
    }
}
