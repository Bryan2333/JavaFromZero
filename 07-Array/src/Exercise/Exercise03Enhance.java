package Exercise;

public class Exercise03Enhance {
    public static void main(String[] args) {

        int[] array = {10, 12, 45, 90};
        int insertNumber = 47;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (insertNumber <= array[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = array.length;
        }

        int[] arrayAdd = new int[array.length + 1];
        for (int i = 0, j = 0; i < arrayAdd.length; i++) {
            if (i != index){
                arrayAdd[i] = array[j];
                j++;
            } else {
                arrayAdd[i] = insertNumber;
            }
        }

        for (int i : arrayAdd) {
            System.out.print(i + " ");
        }
    }
}
