package demo;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {

        int[] array = {1, -1, 10, -20, 100};
        Arrays.sort(array);


        for (int i : array) {
            System.out.printf("%d\n", i);
        }
    }
}
