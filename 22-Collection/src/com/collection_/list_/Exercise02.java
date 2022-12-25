package com.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new Book("红楼梦", "曹雪芹", 100));
        books.add(new Book("西游记", "吴承恩", 10));
        books.add(new Book("水浒传", "施耐庵", 19));
        books.add(new Book("三国", "罗贯中", 80));

        int listSize = books.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                Book book1 = (Book) books.get(j);
                Book book2 = (Book) books.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    books.set(j, book2);
                    books.set(j + 1, book1);
                }
            }
        }

        for (Object book : books) {
            System.out.println(book);
        }

    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, String author, double price) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("名称: %s\t\t价格: %.2f\t\t作者: %s", name, price, author);
    }
}
