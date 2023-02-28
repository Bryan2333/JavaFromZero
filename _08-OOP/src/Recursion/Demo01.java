package Recursion;

public class Demo01 {
    public static void main(String[] args) {
        T.test(10);
    }
}

class T {
    public static void test(int n) {
        if (n > 2) {
            test(n-1);
        }
        System.out.println("n = " + n);
    }
}
