package Method;

public class Demo02 {
    public static void main(String[] args) {

        int[][] array = {{0,0,1}, {1,1,1}, {1,1,3}};
        MyTools.readArray(array);


    }
}

class MyTools {
    public static void readArray(int[][] array) {
        if (array == null) {
            return;
        }
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
