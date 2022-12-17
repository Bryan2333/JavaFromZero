package Type;

public class LogicOperator01 {
    public static void main(String[] args) {
        int age = 50;

        // &&使用
        /*if (age > 20 && age < 90) {
            System.out.println("ok!");
        }*/

        // &使用
        /*if (age > 20 & age < 90) {
            System.out.println("ok!");
        }*/

        //区别
        int a = 5;
        int b = 8;

        // 使用&&
        /*if (age < 1 && ++b < 10) {
            System.out.println("ok");
        }
        System.out.println(b);*/

        // 使用&
        if (age < 1 & ++b < 10) {
            System.out.println("ok");
        }
        System.out.println(b);
    }
}
