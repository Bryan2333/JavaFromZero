package com.bryan.fp04;

import com.bryan.fp04.entity.Author;
import com.bryan.fp04.entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class TestClient {
    private List<Author> authors = null;

    @Test
    public void testNegate() {
        authors.stream()
                .distinct()
                .filter(author -> !(author.getAge() > 17))
//                .filter(new Predicate<Author>() {
//                    @Override
//                    public boolean test(Author author) {
//                        return author.getAge() > 17;
//                    }
//                }.negate())
                .forEach(author -> System.out.println(author.getName() + ":" +
                        author.getAge()));
    }

    @Test
    public void testOr() {
        authors.stream()
                .distinct()
                .filter(author -> author.getAge() > 17 || author.getName().length() < 2)
//                .filter(new Predicate<Author>() {
//                    @Override
//                    public boolean test(Author author) {
//                        return author.getAge() > 17;
//                    }
//                }.or(new Predicate<Author>() {
//                    @Override
//                    public boolean test(Author author) {
//                        return author.getName().length() < 2;
//                    }
//                }))
                .forEach(author -> System.out.println(author.getName() + ":" +
                        author.getAge()));
    }

    @Test
    public void testAnd() {
        // 打印姓名长度大于1并且年龄大于17岁的作家
        authors.stream()
                .distinct()
                .filter(author -> author.getAge() > 17 && author.getName().length() > 1)
//                .filter(new Predicate<Author>() {
//                    @Override
//                    public boolean test(Author author) {
//                        return author.getAge() > 17;
//                    }
//                }.and(new Predicate<Author>() {
//                    @Override
//                    public boolean test(Author author) {
//                        return author.getName().length() > 1;
//                    }
//                }))
                .forEach(author -> System.out.println(author.getName() +
                        ":" + author.getAge()));
    }

    @BeforeEach
    public void getAuthors() {
        // 数据初始化
        Author author1 = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
        Author author2 = new Author(2L, "呀拉索", 15, "这个世界限制了他的思维", null);
        Author author3 = new Author(3L, "易", 14, "狂风追不上他思维的速度", null);
        Author author4 = new Author(3L, "易", 14, "狂风追不上他思维的速度", null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L, "刀的两侧是黑暗和光明", "哲学,爱情", 88, "用一把刀划分爱恨"));
        books1.add(new Book(2L, "一个人不能死在同一把刀下", "个人传记,爱情", 99, "如何从失败中明悟真理"));

        books2.add(new Book(3L, "风吹不到的地方", "哲学", 85, "带你用思维去领悟世界的尽头"));
        books2.add(new Book(3L, "风吹不到的地方", "哲学", 85, "带你用思维去领悟世界的尽头"));
        books2.add(new Book(4L, "吹或不吹", "个人传记", 56, "一个哲学家的故事"));

        books3.add(new Book(5L, "你的剑就是我的剑", "爱情", 56, "无"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家的故事"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家的故事"));

        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        authors = new ArrayList<>(Arrays.asList(author1, author2, author3, author4));
    }
}
