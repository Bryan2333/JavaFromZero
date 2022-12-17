package com.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        String str = "hello";
        List list = new ArrayList();

        for (int i = 0; i < 12; i++) {
            list.add(str + i);
        }

        for (Object o : list) {
            System.out.println(o);
        }
        list.add(1, "hello world!");
        System.out.println(list);
        System.out.println(list.get(4));

        list.remove(5);
        System.out.println(list);

        list.set(6, "Java");
        System.out.println(list);

        Iterator iterator = list.iterator();
        System.out.println("====使用迭代器遍历集合====");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
