import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double[] array = new double[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
            sum += array[i];
        }

        double averageWeight = sum / array.length;
        System.out.println(averageWeight);

    }
}
