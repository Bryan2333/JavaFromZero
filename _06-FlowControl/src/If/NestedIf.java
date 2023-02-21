package If;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的成绩: ");
        double score = input.nextDouble();

        if (score > 8.0) {
            System.out.print("请输入性别: ");
            char gender = input.next().charAt(0);
            if (gender == '男') {
                System.out.println("您将进入男子组决赛");
            } else if (gender == '女') {
                System.out.println("您将进入女子组决赛");
            } else {
                System.out.println("您输入的性别有误");
            }
        } else {
            System.out.println("您被淘汰了！");
        }
    }
}
