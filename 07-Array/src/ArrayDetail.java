public class ArrayDetail {
    public static void main(String[] args) {

        int[] intArray = new int[2];
        double[] doubleArray = new double[2];
        String[] stringArray = new String[2];
        char[] charArray = new char[2];

        for (var i : intArray) {
            System.out.println(i);
        }
        System.out.println("-------------");

        for (var i : doubleArray) {
            System.out.println(i);
        }
        System.out.println("-------------");

        for (var i : stringArray) {
            System.out.println(i);
        }
        System.out.println("-------------");

        for (var i : charArray) {
            System.out.println(i);
        }
    }
}
