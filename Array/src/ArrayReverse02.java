//反转数组

public class ArrayReverse02 {
    public static void main(String[] args) {

        int[] array1 = {11, 22, 33, 44, 55, 66};

        int[] array2 = new int[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
            array2[j] = array1[i];
        }

        array1 = array2;

        for (var i : array1) {
            System.out.print(i + " ");
        }
    }
}
