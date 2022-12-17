package com.collection_.iterator_;

import java.util.ArrayList;
import java.util.Collection;

public class EnhancedFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("Core Java", 100));
        list.add(new Book("Effective Java", 150));
        list.add(new Book("Thinking in Java", 200));

        System.out.println("====增强for循环遍历集合====");
        for (Object book : list) {
            System.out.println(book);
        }

        //增强for循环遍历数组
        System.out.println("====增强for循环遍历数组====");
        int[] intArr = {1, 3, 5, 7, 9};
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}