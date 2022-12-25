package Break;

public class Exercise01 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("i = " + i);
                break;
            }
        }
    }
}
