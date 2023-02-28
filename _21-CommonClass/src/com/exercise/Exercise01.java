package com.exercise;

import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        String str = "abcdef";
        str = reverse(str, 0, 12);
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end) {
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确!");
        }

        char[] chArr = str.toCharArray();
//      int length = start + end;
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
        }
        return Arrays.toString(chArr);
    }
}
