package Recursion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class FibonacciArray {
    public static void main(String[] args) {

//        System.out.println(D.fib(100));

        System.out.println(LocalDateTime.now());
        BigInteger result = D.fib2(10000000);
        System.out.println(LocalDateTime.now());
    }
}

class D {
    public static int fib(int n) {
        if (n < 1) {
            System.out.println("请输入大于1的整数!");
            return -1;
        } else {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        }
    }

    public static BigInteger fib2(int n){
        BigInteger BigFirst = new BigInteger("1");
        BigInteger BigSecond = new BigInteger("1");
        BigInteger BigThird = new BigInteger("0");
        for (int i = 0; i < n - 2; i++) {
            BigThird = BigFirst.add(BigSecond);
            BigFirst = BigSecond;
            BigSecond = BigThird;
        }
        return BigThird;
    }
}
