package Recursion;

public class MonkeyEatPear {
    public static void main(String[] args) {

        System.out.println(Monkey.peach(9));
    }
}

class Monkey {
    // m/2 - 1 = n
    // m = (n + 1) * 2
    // m为第x天的桃子数量，n为第x+1天的桃子数量
    public static int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("Day在1~10天之间");
            return 0;
        }
    }
}
