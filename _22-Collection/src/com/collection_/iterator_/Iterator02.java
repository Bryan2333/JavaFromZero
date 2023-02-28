package com.collection_.iterator_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Iterator02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("Core Java", 100));
        list.add(new Book("Effective Java", 150));
        list.add(new Book("Thinking in Java", 200));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        /*iterator = list.iterator();
        System.out.println("====再次遍历集合====");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }*/
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("书名：%s，价格：%.2f", name, price);
    }
}