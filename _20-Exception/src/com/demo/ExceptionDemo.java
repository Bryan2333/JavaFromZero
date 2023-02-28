package com.demo;

public class ExceptionDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;
        try {
            result = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);

        String str = "Hello, World!";
        int num = Integer.parseInt(str);

        int[] array = {1, 3, 5};
        System.out.println(array[2]);
    }
}
