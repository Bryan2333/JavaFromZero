package Exercise;

public class Exercise03 {
    public static void main(String[] args) {

        int[] array = {10, 12, 45, 90};
        int[] arrayAdd = new int[array.length + 1];
        int insertNumber = 23;

        for (int i = 0; i < array.length; i++) {
            arrayAdd[i] = array[i];
        }
        arrayAdd[arrayAdd.length - 1] = insertNumber;

        for (int i = 0; i < arrayAdd.length - 1; i++) {
            for (int j = 0; j < arrayAdd.length - 1 - i; j++) {
                if (arrayAdd[j] > arrayAdd[j+1]) {
                    int temp = arrayAdd[j];
                    arrayAdd[j] = arrayAdd[j+1];
                    arrayAdd[j+1] = temp;
                }
            }
        }

        for (var i : arrayAdd) {
            System.out.print(i + " ");
        }
    }
}
