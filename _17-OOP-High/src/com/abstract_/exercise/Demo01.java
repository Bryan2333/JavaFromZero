package com.abstract_.exercise;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ifCharacter = false;

        String str = input.next();
        for (char i : str.toCharArray()) {
            if (('a' < i && i < 'z') || ('A' < i && i < 'Z')) {
                ifCharacter = true;
            } else {
                ifCharacter = false;
                break;
            }
        }

        if (ifCharacter) {
            System.out.println("所输入字符串全部为字母");
        }
    }
}
