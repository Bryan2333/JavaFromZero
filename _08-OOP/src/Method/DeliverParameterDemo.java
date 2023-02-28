package Method;

public class DeliverParameterDemo {
    public static void main(String[] args) {

        int[] array = new int[2];
        array[0] = 100;
        A.test(array);
        System.out.println(array[0]);

    }
}

class A {
    public static void test(int[] array) {
        array[0] = 200;
    }

    public static void test02(Integer i) {
        i = 100;
    }
}
