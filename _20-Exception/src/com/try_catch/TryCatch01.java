package com.try_catch;

public class TryCatch01 {
    public static void main(String[] args) {
        try {
            String str = "";
            int num = Integer.parseInt(str);
            System.out.println("num = " + num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally块被执行");
        }

        System.out.println("程序继续");
    }
}
