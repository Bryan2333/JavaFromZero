public class ArrayCopy {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        for (var i : array2) {
            System.out.println(i);
        }
    }
}
