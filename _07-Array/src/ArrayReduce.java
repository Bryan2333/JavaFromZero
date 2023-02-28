import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean ifContinue = true;

        while (ifContinue) {

            int[] arrayReduce = new int[array.length - 1];
            for (int i = 0; i < arrayReduce.length; i++) {
                arrayReduce[i] = array[i];
            }
            array = arrayReduce;

            if (array.length == 1) {
                System.out.println("数组无法再缩减了! 以下为缩减后的数组：");
                for (var i : array) {
                    System.out.print(i + " ");
                }
                break;
            } else {
                System.out.println("缩减成功！以下为缩减后的数组：");
                for (var i : array) {
                    System.out.print(i + " ");
                }
                System.out.print('\n' + "请问是否要继续缩减数组(y/n): ");
                char willing = input.next().charAt(0);
                if (willing == 'n') {
                    ifContinue = false;
                }
            }
        }
    }
}
