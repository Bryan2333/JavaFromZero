package ForLoop;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int begin = input.nextInt(); //开始
        int end = input.nextInt(); //结束
        int times = input.nextInt(); //倍数
        int count = 0;
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            if (i % times == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.printf("count = " + count + ", sum = " + sum);
    }
}
