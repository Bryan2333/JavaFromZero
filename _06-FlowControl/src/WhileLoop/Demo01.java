package WhileLoop;

public class Demo01 {
    public static void main(String[] args) {
        int i;
        /*while (i <= 10) {
            System.out.println("Hello, World!" + " " + i);
            i++;
        }*/

        i = 1;
        while (i <= 100) {
            if(i % 3 == 0) {
                System.out.println("i = " + i);
            }
            i++;
        }
        System.out.println("------------------------");

        int j = 40;
        while (j <= 200) {
            if(j % 2 == 0) {
                System.out.println("j = " + j);
            }
            j++;
        }
    }
}
