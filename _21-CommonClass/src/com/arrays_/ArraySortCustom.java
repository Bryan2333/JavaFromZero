package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortCustom {
    public static void main(String[] args) {
        Integer[] array = {1, -1, 7, 0, 89};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        Integer[] array2 = {1, -1, 7, 0, 89};
        bubbleSort02(array2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i1 - i2;
            }
        });

    }

    public static void bubbleSort(Integer[] array) {
        int temp = 0;
        if (array != null) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j+1]) {
                        temp  = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void bubbleSort02(Integer[] array, Comparator c) {
        int temp = 0;
        if (array != null) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (c.compare(array[j], array[j+1]) > 0) {
                        temp  = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }
}
