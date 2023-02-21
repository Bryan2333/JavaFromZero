package com.use;

import com.xiaoqiang.Dog;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

       /* Dog dog = new Dog();
        System.out.println(dog);

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);*/

        int[] array = {1, 3, 2, 7, 6};
        Arrays.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
