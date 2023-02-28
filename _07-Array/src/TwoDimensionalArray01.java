public class TwoDimensionalArray01 {
    public static void main(String[] args) {

        int[][] array = {{0, 0, 0, 0, 0,}, {0, 1, 3}};

        int[] test = array[0];
        test[0] = 1;

        for (var i : array) {
            for (var j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (var i : test) {
            System.out.print(i + " ");
        }
    }
}
