package Method;

public class Exercise01 {
    public static void main(String[] args) {

        System.out.println(AA.isOdd(1));
        AA.printChar(2,2,'a');
    }
}

class AA {
    public static boolean isOdd(int x) {
        return x % 2 != 0;
    }

    public static void printChar(int row, int column, char ch) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}