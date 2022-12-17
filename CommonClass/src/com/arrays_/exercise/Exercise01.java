package com.arrays_.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新版", 50);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("Java从入门到放弃", 300);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o2.getPrice() - o1.getPrice());
            }
        });
        System.out.println("====按价格从大到小排序====");
        for (Book book : books){
            System.out.println(book);
        }

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
        });
        System.out.println("\n====按价格从小到大排序====");
        for (Book book : books){
            System.out.println(book);
        }

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().length() - o1.getName().length();
            }
        });
        System.out.println("\n====按书名长度从大到小排序=======");
        for (Book book : books) {
            System.out.println(book);
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("书名：%s, 价格：%.0f", name, price);
    }
}