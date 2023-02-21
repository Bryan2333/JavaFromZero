package Exercise;

public class Exercise01 {
    public static void main(String[] args) {

        double money = 100000;
        int count = 0;
        while(true) {
            if(money > 50000) {
                money -= money * 0.05;
                count++;
            } else if(money >= 1000) {
                money -= 1000;
                count++;
            }
            else {
                break;
            }
        }
        System.out.printf("count = %d, money = %.2f", count, money);
    }
}
