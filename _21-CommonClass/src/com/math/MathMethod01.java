package com.math;

public class MathMethod01 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.random() * 11);
            System.out.println(random);
        }

        System.out.println("==================");
        for (int i = 0; i < 10; i++) {
            int random = (int)(1 + Math.random() * 10);
            System.out.println(random);
        }
        System.out.println("==================");

        double ceilNum = Math.ceil(5.6);
        System.out.println(ceilNum);

        double floorNum = Math.floor(5.6);
        System.out.println(floorNum);

        double sqrtNum = Math.sqrt(2);
        System.out.printf("%.2f\n", sqrtNum);

        double piNum = Math.PI;
        System.out.println(piNum);
    }
}
