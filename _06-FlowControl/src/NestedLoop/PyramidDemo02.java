package NestedLoop;

import java.util.Scanner;

public class PyramidDemo02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入行数(奇数): ");
        int level = input.nextInt();

        for (int i = 1; i <= level/ 2 + 1; i++) {
            for(int k = 1; k <= level/2 + 1 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = 1; i <= level / 2 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= level - 2 * i; k++) {
                if (k == 1 || k == level - 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
