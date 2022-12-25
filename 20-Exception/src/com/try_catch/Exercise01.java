package com.try_catch;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("请输入一个整数: ");
            try {
                num = Integer.parseInt(input.next()); //可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是一个整数");
            }
        }
        System.out.println("num = " + num);
    }
}
