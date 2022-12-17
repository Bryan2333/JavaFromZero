package NestedLoop;

import java.util.Scanner;

public class PyramidDemo01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int level = input.nextInt(); //让用户输入层数

        //控制打印层数
        for (int i = 1; i <= level; i++) {
            //控制每层打印的空格
            for (int k = 1; k <= level - i; k++) {
                System.out.print(" ");
            }
            //控制每层打印 * 的个数
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == 2 * i - 1 || i == level) {
                    System.out.print("*"); //每行第一个、最后一个以及最后一行打印 *
                } else {
                    System.out.print(" "); //否则打印空格
                }
            }
            //每打印完一行就换行
            System.out.println();
        }
    }
}
