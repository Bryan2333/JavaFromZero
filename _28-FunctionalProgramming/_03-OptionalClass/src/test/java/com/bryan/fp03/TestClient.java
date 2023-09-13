package com.bryan.fp03;

import com.bryan.fp03.entity.Author;
import com.bryan.fp03.entity.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("all")
public class TestClient {
    @Test
    public void test07() {
        Optional<Author> author = getAuthor();
        author.map(author1 -> author1.getBooks())
                .ifPresent(books -> System.out.println(books));
    }

    @Test
    public void test06() {
        Optional<Author> author = getAuthor();
        author.filter(author1 -> author1.getAge() > 50).
                ifPresent(author1 -> System.out.println(author1.getName()));

        author.filter(author1 -> author1.getAge() < 50)
                .ifPresent(author1 -> System.out.println(author1.getName()));
    }

    @Test
    public void test05() {
//        Optional<Author> author = Optional.ofNullable(null);
        Optional<Author> author = getAuthor();
        Author author1 = author.orElseThrow(() -> new RuntimeException("对象为空"));
        System.out.println(author1.getName());
    }
    @Test
    public void test04() {
//        Optional<Author> author = getAuthor();
        Optional<Author> author = Optional.ofNullable(null);
//        Author author1 = author.orElseGet(new Supplier<Author>() {
//            @Override
//            public Author get() {
//                return new Author();
//            }
//        });
        Author author1 = author.orElseGet(() -> new Author());

        System.out.println(author1.getName());

    }
    @Test
    public void test03() {
        Optional<Author> author = getAuthor();
//        Author author1 = author.get();
    }

    @Test
    public void test02() {
        Optional<Author> author = getAuthor();
        author.ifPresent(authorOption -> System.out.println(authorOption.getName() + ":" + authorOption.getAge()));
    }
    @Test
    public void test01() {
//        Author author = getAuthor();
//        Optional<Author> authorOption = Optional.ofNullable(author);
//        authorOption.ifPresent(author1 -> System.out.println(author1.getName()));

        Optional<Author> author = getAuthor();
        author.ifPresent(authorOption -> System.out.println(authorOption.getName()));

//        Optional<Object> o = Optional.of(null);
    }

    public static Optional<Author> getAuthor() {
        // 数据初始化
        Author author = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
        List<Book> books = new ArrayList<>();
        books.add(new Book(1L, "刀的两侧是黑暗和光明", "哲学,爱情", 88, "用一把刀划分爱恨"));
        books.add(new Book(2L, "一个人不能死在同一把刀下", "个人传记,爱情", 99, "如何从失败中明悟真理"));
        author.setBooks(books);
        return Optional.ofNullable(author);
    }
}
