package com.string_buffer;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String price = "123456.78";
        StringBuffer sb = new StringBuffer(price);

        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ',');
        }

        System.out.println(sb);
    }
}
