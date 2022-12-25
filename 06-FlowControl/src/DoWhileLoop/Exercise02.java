package DoWhileLoop;

public class Exercise02 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        do {
            if(i % 5 == 0 && i % 3 != 0) {
                count++;
            }
            i++;
        }while(i <= 200);
        System.out.println("count = " + count);
    }
}
