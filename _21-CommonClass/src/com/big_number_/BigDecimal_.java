package com.big_number_;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("3.141592653589397111111111");
        BigDecimal bigDecimal2 = new BigDecimal("0.9384");

        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println(add);

        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println(subtract);

        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
        System.out.println(multiply);
    }
}
