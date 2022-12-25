package Exercise;

public class Demo01 {
    public static void main(String[] args) {

        char[] charArray = new char[26];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char)('A' + i);
        }

        for (var i : charArray) {
            System.out.print(i + " ");
        }
    }
}
