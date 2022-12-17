package com.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add("C");
        list.add("C++");
        System.out.println("list = " + list);
        System.out.println(list.get(0));
    }
}
