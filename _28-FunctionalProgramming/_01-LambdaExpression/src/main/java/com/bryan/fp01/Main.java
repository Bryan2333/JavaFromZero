package com.bryan.fp01;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("不是用Lambda表达式");
//            }
//        }).start();
//
//        new Thread(() -> System.out.println("使用Lambda表达式")).start();
//
//        int ret = calculateNum(10, 20, new IntBinaryOperator() {
//            @Override
//            public int applyAsInt(int left, int right) {
//                return left + right;
//            }
//        });
//        System.out.println(ret);
//
//        ret = calculateNum(10, 25, (int left, int right) -> {return left + right;});
//        System.out.println(ret);
//
//        printNum(new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                return value % 2 == 0;
//            }
//        });
//
//        printNum((int value) -> {return value % 2 == 0;});
//        int ret = typeConvert(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        });
//        System.out.println(ret);
//
//        ret = typeConvert((String str) -> {
//            return Integer.parseInt(str);
//        });
//        System.out.println(ret);
        forearchArr(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value);
            }
        });
        System.out.println();

        forearchArr((int value) -> System.out.print(value));
        System.out.println();

        forearchArr(value -> System.out.print(value));
    }

    public static int calculateNum(int a, int b, IntBinaryOperator operator) {
        return operator.applyAsInt(a, b);
    }

    public static void printNum(IntPredicate predicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }

    public static <R> R typeConvert(Function<String, R> function) {
        String str = "12345";
        return function.apply(str);
    }

    public static void forearchArr(IntConsumer consumer) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            consumer.accept(i);
        }
    }
}
