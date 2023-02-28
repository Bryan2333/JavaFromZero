public class TwoDimensionalArray02 {
    public static void main(String[] args) {

        int[][] array = new int[10][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1]; //给每个数组分配空间
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + 1;
            }
        }

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
