package Exercise;

public class Exercise03 {
    public static void main(String[] args) {

        double sum = 0;
        int flag = 1;

        for (double i = 1; i <= 100; i++) {
            double item = 1 / i;
            sum += flag * item;
            flag = -flag;
        }

        System.out.printf("%.3f", sum);
    }
}
