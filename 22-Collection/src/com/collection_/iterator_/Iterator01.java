package com.collection_.iterator_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(19);
        list.add(true);
        list.add("Core Java");
        list.add("Effective Java");
        list.add("Thinking in Java");


        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
