package demo;

public class Demo02 {
    public static void main(String[] args) {
        int[] array = {-1, 0, 1};

        for (int i = 0; i <= array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }
        System.out.println("退出程序");
    }
}
