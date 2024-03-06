package com.bryan.fp05;

import com.bryan.fp05.entity.Author;
import com.bryan.fp05.entity.Book;
import com.bryan.fp05.interfaceFP.UseString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

@SuppressWarnings("all")
public class TestClient {
    private List<Author> authors = null;

    public static String subAuthorName(String str, UseString useString) {
        int start = 0;
        int length = 1;
        return useString.use(str, start, length);
    }

    @Test
    public void test04() {
        authors.stream()
                .distinct()
                .map(author -> author.getName())
                .map(StringBuilder::new)
//                .map(name -> new StringBuilder(name))
                .map(stringBuilder -> stringBuilder.append("-----三更"))
                .forEach(sb -> System.out.println(sb));
    }

    @Test
    public void test03() {
//        String str = subAuthorName("三更草堂", new UseString() {
//            @Override
//            public String use(String str, int start, int length) {
//                return str.substring(start, length);
//            }
//        });
        subAuthorName("三更草堂", String::substring);
    }
    @Test
    public void test02() {
        StringBuilder stringBuilder = new StringBuilder();
        authors.stream()
                .distinct()
                .map(author -> author.getName())
                .forEach(stringBuilder::append);
//                .forEach(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        stringBuilder.append(s);
//                    }
//                });
        System.out.println(stringBuilder);
    }

    @Test
    public void test01() {
        authors.stream()
                .distinct()
                .map(new Function<Author, Integer>() {
                    @Override
                    public Integer apply(Author author) {
                        return author.getAge();
                    }
                })
                .map(String::valueOf)
//                .map(new Function<Integer, String>() {
//                    @Override
//                    public String apply(Integer integer) {
//                        return String.valueOf(integer);
//                    }
//                })
                .forEach(age -> System.out.println(age));
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
