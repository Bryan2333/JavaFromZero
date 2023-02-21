package Switch;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        switch (ch) {
            case 'a' -> System.out.println("A");
            case 'b' -> System.out.println("B");
            case 'c' -> System.out.println("C");
            case 'd' -> System.out.println("D");
            case 'e' -> System.out.println("E");
            default -> System.out.println("Other");
        }
    }
}
