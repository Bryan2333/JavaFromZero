package ChapterExercise;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Player player01 = new Player();
        player01.play();
    }
}

class Player {
    public int countWin = 0;
    public int countLose = 0;

    // 0表示石头， 1表示剪刀，2表示布
    public void play() {

        Random r = new Random();
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> rules = new HashMap<>();
        rules.put(0,"石头");
        rules.put(1,"剪刀");
        rules.put(2,"布");

        for (int i = 0; i < 3; i++) {

            int computerNum = r.nextInt(3);
            System.out.print("请输入数字(0~2): ");
            int playerNum = input.nextInt();

            System.out.printf("您出%s, 电脑出%s\n", rules.get(playerNum), rules.get(computerNum));
            if (playerNum == 0 && computerNum == 1) {
                countWin++;
                System.out.println("你赢了!");
            } else if (playerNum == 1 && computerNum == 2) {
                countWin++;
                System.out.println("你赢了!");
            } else if (playerNum == 2 && computerNum == 0) {
                countWin++;
                System.out.println("你赢了!");
            } else if(playerNum == computerNum) {
                System.out.println("平手!");
            } else {
                System.out.println("你输了!");
                countLose++;
            }
        }
        System.out.printf("你赢了%d次，输了%d次", countWin, countLose);
    }
}
