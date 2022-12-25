package com.big_number_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("1101111111111111111111111111111111");
        BigInteger bigInteger2 = new BigInteger("100");

        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println(add);

        BigInteger subtract = bigInteger1.subtract(bigInteger2);
        System.out.println(subtract);

        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        System.out.println(multiply);

        BigInteger divide = bigInteger1.divide(bigInteger2);
        System.out.println(divide);
    }
}
