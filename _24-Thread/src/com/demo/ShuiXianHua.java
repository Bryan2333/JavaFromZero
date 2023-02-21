package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ShuiXianHua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        int num;
        System.out.print("num = ");
        num = input.nextInt();

        int temp = num;
        int count = 0; //判断该数的位数
        int digit;
        while (num > 0) {
            digit = num % 10;
            nums.add(digit);
            count++;
            num = num / 10;
        }

        int sum = 0;
        for (Integer integer : nums) {
            sum += Math.pow(integer, count);
        }

        if (sum == temp) {
            System.out.printf("%d 是水仙花数\n", temp);
        }
    }
}
