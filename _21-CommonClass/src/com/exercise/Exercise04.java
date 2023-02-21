package com.exercise;


public class Exercise04 {
    public static void main(String[] args) {

        count("Hello, World!");
    }

    public static void count(String str) {
        if (str == null) {
            System.out.println("字符串不能为空!");
            return;
        }

        int lowerCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digitCount++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else {
                otherCount++;
            }
        }
        System.out.printf("大写字母有%d个，小写字母有%d个，数字有%d个，其他字符%d个%n\n",
                upperCount, lowerCount, digitCount, otherCount);
    }
}
