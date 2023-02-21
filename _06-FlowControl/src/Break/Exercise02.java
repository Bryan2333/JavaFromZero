package Break;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        for(int i = 1; i <= 3; i++) {
            System.out.print("请输入用户名: ");
            String userName = input.next();

            System.out.print("请输入密码: ");
            String password = input.next();

            if ("Bryan".equals(userName) && "666".equals(password)) {
                System.out.println("登陆成功!");
                break;
            } else {
                System.out.println("用户名或密码错误! 您还有" + (3-i) + "次机会!");
            }

        }
    }
}
