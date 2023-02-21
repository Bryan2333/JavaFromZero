package com.main_;

public class demo01 {
    public static void main(String[] args) {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.printf("第%d个参数 = %s", (i + 1), args[i]);
            }
        }

    }
}