package com.collection_.set_.linkedhashset_;

import java.util.LinkedHashSet;

@SuppressWarnings("all")
public class LinkedHashSet01 {

    public static void main(String[] args) {

        LinkedHashSet set = new LinkedHashSet();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        System.out.println(set);
    }

    public static void main(int a) {
        System.out.println(a);
    }
}
