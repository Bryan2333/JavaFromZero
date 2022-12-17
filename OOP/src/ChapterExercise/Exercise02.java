package ChapterExercise;

public class Exercise02 {
    public static void main(String[] args) {
        String str = "World";
        String[] strArray = {"Hello", ",", "World", "!"};
        int index = find(strArray, str);
        System.out.println(index);
    }

    public static int find(String[] strArray, String str) {
        if (strArray != null && str != null) {
            for (int i = 0; i < strArray.length; i++) {
                if (str.equals(strArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
}
