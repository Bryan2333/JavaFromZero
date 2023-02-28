package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {

        //toString
        /*Integer[] array = {1, 20, 100};
        System.out.println(Arrays.toString(array));*/

        //sort
        Integer[] array = {1, -1, 7, 0, 89};
        Arrays.sort(array); //默认排序方法
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new Comparator<Integer>() { //自定排序方法
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(array));

        Integer[] array3 = {1, 2, 30, 50, 72};
        int index = Arrays.binarySearch(array3, 30);
        System.out.println(index);

        Integer[] array4 = Arrays.copyOf(array3, array3.length);
        System.out.println(Arrays.toString(array4));

        // fill填充数组
        Integer[] array5 = {1, 5, 2, 10};
        Arrays.fill(array5, 20);
        System.out.println(Arrays.toString(array5));

        // equals判断数组元素是否完全一致
        Integer[] array6 = {1, 2, 3, 4, 5};
        Integer[] array7 = {1, 2, 3, 4, 5};
        Integer[] array8 = {1, 3, 2, 4, 5};
        System.out.println(Arrays.equals(array6, array8));
    }
}
