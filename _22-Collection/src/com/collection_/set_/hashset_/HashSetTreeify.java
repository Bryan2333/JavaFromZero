package com.collection_.set_.hashset_;

import java.util.HashSet;

@SuppressWarnings("all")
public class HashSetTreeify {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 12; i++) {
            hashSet.add(new A(100));
        }
    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
