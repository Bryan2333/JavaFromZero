//汉诺塔问题
package Recursion;

public class HanNuoTa {
    public static void main(String[] args) {

        Tower.movePan(32, 'a', 'b', 'c');
    }
}

class Tower {

    public static int count = 0;
    // num表示移动个数，a,b,c分别表示A塔、B塔、C塔
    public static void movePan(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.printf("%c -> %c\n", a, c);
        } else {
            movePan(num-1, a, c, b);
            System.out.printf("%c -> %c\n", a, c);
            movePan(num-1, b, a, c);
        }

    }
}
