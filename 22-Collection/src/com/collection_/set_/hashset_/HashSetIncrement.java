package com.collection_.set_.hashset_;

import java.util.HashSet;

public class HashSetIncrement {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        for (int i = 0; i < 100; i++) {
            hashSet.add(i);
        }
    }
}
