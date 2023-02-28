package NestedLoop;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalScoreSum = 0;
        double passNum = 0;
        for (int i = 1; i <= 3; i++) {
            double classScoreSum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("请输入第" + i + "个班级第" + j + "位学生的成绩: ");
                double score = input.nextDouble();
                if (score >= 60) {
                    passNum++;
                }
                classScoreSum += score;
                System.out.println("成绩为 " + score);
            }
            totalScoreSum += classScoreSum;
            System.out.println("第" + i + "个班的平均分为 " + (classScoreSum / 5));
        }

        System.out.println("三个班平均分为 " + (totalScoreSum / 15));
        System.out.println("及格人数为 " + passNum + "人");
    }
}
