//冒泡排序

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {24, 69, 80, 57, 13};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (var i : array) {
            System.out.print(i + " ");
        }
    }
}
