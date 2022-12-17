package Switch;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month) {
            case 3, 4, 5 -> System.out.println("春季");
            case 6, 7, 8 -> System.out.println("夏季");
            case 9, 10, 11 -> System.out.println("秋季");
            case 12, 1, 2 -> System.out.println("冬季");
            default -> System.out.println("您输入的月份有误！");
        }
    }
}
