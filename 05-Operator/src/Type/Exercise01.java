package Type;

public class Exercise01 {
    public static void main(String[] args) {
        int daysLeft = 59;
        int weekLeft = daysLeft / 7;
        int dayLeft = daysLeft % 7;

        System.out.println("合 " + weekLeft + "周 " + dayLeft + " 天");
    }
}
