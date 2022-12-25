package If;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入信用分: ");
        int credit = input.nextInt();

        if (credit >= 0 && credit <= 100) {
            if (credit == 100) {
                System.out.println("信用极好");
            } else if (80 < credit && credit <= 99) {
                System.out.println("信用优秀");
            } else if (60 <= credit && credit <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else {
            System.out.println("信用分需要在1~100之间，请重新输入!");
        }
    }
}
