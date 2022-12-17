package com.bryan.reflection.class_;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();

        for (double i = 0; i < 1000000; i++) {
            doubles.add(i);
        }

        System.out.println(doubles.get(0));
    }
}
