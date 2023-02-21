package Switch;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double score = input.nextDouble();

        if(score >= 0 && score <= 100) {
            switch ((int)(score / 60)) {
                case 1 -> System.out.println("Pass!");
                case 0 -> System.out.println("Failed!");
            }
        } else {
            System.out.println("您输入的成绩无效！");
        }
    }
}
