package com.standard;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        // System.in 编译类型 InputStream
        // System.in 运行类型 BufferedInputStream
        System.out.println(System.in.getClass());

        // System.out 编译类型 PrintStream
        // System.out 运行类型 PrintStream
        System.out.println(System.out.getClass());

        System.out.println("Hello, Java!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String input = scanner.next();
        System.out.println(input);
    }
}
