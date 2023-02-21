//反转数组

public class ArrayReverse01 {
    public static void main(String[] args) {

        int[] array = {11, 22, 33, 44, 55, 66};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("=======反转后=========");
        for (var i : array) {
            System.out.print(i + " ");
        }
    }
}
