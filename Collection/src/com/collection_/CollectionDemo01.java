package com.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(19);
        list.add(true);
        System.out.println("list = " + list);

        System.out.println(list.contains("Hello"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.remove("Hello");
        System.out.println("list = " + list);

        list.clear();
        System.out.println("list = " + list);

        List list2 = new ArrayList();
        list2.add("Thinking in Java");
        list2.add("Core Java");
        list.addAll(list2);
        System.out.println("list = " + list);

        System.out.println(list.containsAll(list2));

        list.removeAll(list2);
        list.add("Effective Java");
        System.out.println("list = " + list);
    }
}
