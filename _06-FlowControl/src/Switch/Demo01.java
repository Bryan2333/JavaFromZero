package Switch;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        switch (ch) {
            case 'a' -> System.out.println("星期一");
            case 'b' -> System.out.println("星期二");
            case 'c' -> System.out.println("星期三");
            case 'd' -> System.out.println("星期四");
            case 'e' -> System.out.println("星期五");
            case 'f' -> System.out.println("星期六");
            case 'g' -> System.out.println("星期天");
            default -> System.out.println("请输入a~g之间的字母");

        }
    }
}
