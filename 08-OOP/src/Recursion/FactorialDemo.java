package Recursion;

public class FactorialDemo {
    public static void main(String[] args) {

        System.out.println(B.factor(5));
    }
}

class B {
    public static int factor(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factor(n-1);
        }
    }
}
