package demo;

public class Demo01 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }
        System.out.println("end.....");
    }
}
