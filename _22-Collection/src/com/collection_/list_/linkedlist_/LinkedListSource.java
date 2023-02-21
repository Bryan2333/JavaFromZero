package com.collection_.list_.linkedlist_;

import java.util.LinkedList;

public class LinkedListSource {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 1; i <= 3; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedlist = " + linkedList);

        linkedList.remove();
        System.out.println("linkedlist = " + linkedList);
    }
}
