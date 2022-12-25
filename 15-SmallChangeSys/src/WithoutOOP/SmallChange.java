package WithoutOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean toLeave = false;

        //完成零钱通明细
        String details = "--------------零钱通明细-------------------";

        //完成收益入账模块
        double money = 0;
        double balance = 0;
        Date date = null; // 表示日期的类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //用于日期格式化

        //完成消费模块
        String note = "";


        do {
            System.out.println("\n============零钱通============");
            System.out.println("\t\t\t1、零钱通明细");
            System.out.println("\t\t\t2、收益入账");
            System.out.println("\t\t\t3、消费");
            System.out.println("\t\t\t4、退出");

            System.out.print("请输入您的选择: ");
            String choice = input.next();
            switch (choice) {
                case "1" -> System.out.println(details);
                case "2" -> {
                    System.out.print("收益入账金额: ");
                    money = input.nextDouble();
                    //找出不合理的金额范围
                    if (money <= 0) {
                        System.out.println("收益入账金额需大于0元");
                        break;
                    }
                    // 校验money的数值
                    balance += money;
                    // 拼接收益入账信息
                    date = new Date(); //获取当天日期
                    details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date)
                            + "\t" + balance;
                }
                case "3" -> {
                    System.out.print("消费金额: ");
                    money = input.nextDouble();
                    // money的范围校验
                    if (money > balance || money <= 0) {
                        System.out.printf("你的消费金额应该在0~%.2f元\n", balance);
                        break;
                    }
                    System.out.print("消费说明: ");
                    note = input.next();
                    date = new Date();
                    balance -= money;
                    details += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date)
                            + "\t" + balance;
                }
                case "4" -> {

                    String toContinue;
                    while (true) {
                        System.out.print("您确定要退出吗(y/n)? : ");
                        toContinue = input.next();
                        if ("y".equals(toContinue) || "n".equals(toContinue)) {
                            break;
                        }
                    }
                    if ("y".equals(toContinue)) {
                        toLeave = true;
                    }
                }
                default -> System.out.println("您的输入有误!");
            }
        }while(!toLeave);

        System.out.println("=========您退出了零钱通=========");
    }
}
