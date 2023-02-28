package com.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("C Primer Plus");
        list.add("Head First Java");
        list.add(1, "Thinking in Java");
        System.out.println("list = " + list);

        List list2 = new ArrayList();
        list2.add("Effective C++");
        list2.add("Effective Java");
        list.addAll(1, list2);
        System.out.println(list);

        System.out.println(list.indexOf("C Primer Plus")); //输出0

        list.add("C Primer Plus");
        System.out.println(list);
        System.out.println(list.lastIndexOf("C Primer Plus")); //输出

        list.remove(0);
        System.out.println(list);

        list.set(0, "TCPL");
        System.out.println(list);

        List returnList = list.subList(0, 3);
        System.out.println(returnList);
    }
}
