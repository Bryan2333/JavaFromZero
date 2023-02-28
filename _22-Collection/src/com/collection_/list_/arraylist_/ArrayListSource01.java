package com.collection_.list_.arraylist_;

import java.util.ArrayList;

public class ArrayListSource01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }

        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }

        arrayList.add(100);
    }
}
