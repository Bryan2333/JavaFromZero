public class ArrayAssign {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[] array2 = array;

        array2[1] = 5;

        for (var i : array) {
            System.out.println(i);
        }

        for (var i : array2) {
            System.out.println(i);
        }
    }
}
