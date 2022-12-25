package Exercise;

public class Exercise02 {
    public static void main(String[] args) {

        int[] array = {4, -1, 9, 10, 23, 110, -23, 888};

        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("最大值为" + array[maxIndex] + ", 其下标为" + maxIndex);
    }
}
