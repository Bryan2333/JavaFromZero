package com.bryan.fp02;

import com.bryan.fp02.entity.Author;
import com.bryan.fp02.entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class TestClient {
    private List<Author> authors = null;

    @Test
    public void test24() {
        // 求作家年龄的最小值
        Optional<Integer> minAge = authors.stream()
                .distinct()
                .map(author -> author.getAge())
                // 初始值会被初始化成第一个元素
                .reduce(new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer result, Integer element) {
                        return element < result ? element : result;
                    }
                });
        minAge.ifPresent(age -> System.out.println(age));
    }

    @Test
    public void test23() {
        // 求作家年龄的最小值
        Integer minAge = authors.stream()
                .distinct()
                .map(author -> author.getAge())
                .reduce(Integer.MAX_VALUE, (result, element) ->
                        element < result ? element : result);
//                .reduce(Integer.MAX_VALUE, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer result, Integer element) {
//                        return element < result ? element : result;
//                    }
//                });
        System.out.println(minAge);
    }

    @Test
    public void test22() {
        // 求作家年龄的最大值
        Integer maxAge = authors.stream()
                .distinct()
                .map(author -> author.getAge())
                .reduce(Integer.MIN_VALUE, (result, element) ->
                        element > result ? element : result
                );
//                .reduce(Integer.MIN_VALUE, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer result, Integer element) {
//                        return element > result ? element : result;
//                    }
//                });
        System.out.println(maxAge);
    }

    @Test
    public void test21() {
        // 求作家年龄的总和
        Integer ageSum = authors.stream()
                .distinct()
                .map(author -> author.getAge())
                .reduce(0, (result, element) -> result + element);
//                .reduce(0, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer result, Integer element) {
//                        return result + element;
//                    }
//                });
        System.out.println(ageSum);
    }

    @Test
    public void test20() {
        Optional<Author> first = authors.stream()
                .distinct()
                .sorted((author1, author2) -> author1.getAge() - author2.getAge())
                .findFirst();
        first.ifPresent(author -> System.out.println(author.getName() + ":" + author.getAge()));
    }

    @Test
    public void test19() {
        Optional<Author> optionalAuthor = authors.stream()
                .filter(author -> author.getAge() > 98)
                .findAny();
//              .ifPresent(new Consumer<Author>() {
//                  @Override
//                  public void accept(Author author) {
//                      System.out.println(author.getName());
//                  }
//              });
        optionalAuthor.ifPresent(author -> System.out.println(author.getName()));
    }

    @Test
    public void test18() {
        // 判断作家是否都是成年人
        boolean res = authors.stream()
                .allMatch(author -> author.getAge() > 18);
        System.out.println(res);
    }

    @Test
    public void test17() {
        // 判断是否存在年龄大于29岁的作家
        boolean res = authors.stream()
                .anyMatch(author -> author.getAge() > 50);
//                .anyMatch(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer > 29;
//                    }
//                });
        System.out.println(res);
    }

    @Test
    public void test16() {
        // 获取一个存放作家名字的List集合
        List<String> nameList = authors.stream()
                .map(author -> author.getName())
                .collect(Collectors.toList());
        System.out.println(nameList);

        // 获取一个存放书名的Set集合
        Set<Book> bookName = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .collect(Collectors.toSet());
        bookName.forEach(bookname -> System.out.println(bookname));

        // 获取一个Map集合，key为作者的姓名，value为对应的书籍集合
        Map<String, List<Book>> map = authors.stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBooks()));
//                .collect(Collectors.toMap(new Function<Author, String>() {
//                    @Override
//                    public String apply(Author author) {
//                        return author.getName();
//                    }
//                }, new Function<Author, List<Book>>() {
//                    @Override
//                    public List<Book> apply(Author author) {
//                        return author.getBooks();
//                    }
//                }));
        map.entrySet().forEach(entry -> System.out.println("作家: " + entry.getKey()
                + "书籍: " + entry.getValue()));
    }

    @Test
    public void test15() {
        // 获取这些作家书籍的最高分和最低分
        Optional<Integer> max = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .map(book -> book.getScore())
                .max((score1, score2) -> score1 - score2); // 按升序规则
        System.out.println("最高分" + max.get());

        Optional<Integer> min = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .map(book -> book.getScore())
                .min((score1, score2) -> score1 - score2);
        System.out.println("最低分" + min.get());
    }

    @Test
    public void test14() {
        // 打印这些作家书籍的数目
        long count = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .count();
        System.out.println(count);
    }

    @Test
    public void test13() {
        authors.stream()
                .map(author -> author.getName())
                .distinct()
                .forEach(name -> System.out.println(name));
    }

    @Test
    public void test12() {
        authors.stream()
                .flatMap(author -> author.getBooks().stream()) // 将作家书籍的集合映射称多个书籍
                .distinct() // 对书籍进行去重
                .flatMap(book -> Arrays.stream(book.getCategory().split(","))) // 将书本映射称书本的类型
                .distinct() // 对书籍的类型进行去重
                .forEach(category -> System.out.println(category));
    }

    @Test
    public void test11() {
        // 打印所有书籍的名字，去重
        authors.stream()
//                .flatMap(new Function<Author, Stream<Book>>() {
//                    @Override
//                    public Stream<Book> apply(Author author) {
//                        return author.getBooks().stream();
//                    }
//                })
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .forEach(book -> System.out.println(book.getName()));
    }

    @Test
    public void test10() {
        // 对流中的元素进行去重、降序排序，打印年龄最大的作家以外的作家名字
        authors.stream()
                .distinct()
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
                .skip(1)
                .forEach(author -> System.out.println(author.getName() + ":" + author.getAge()));
    }

    @Test
    public void test09() {
        // 对流中的元素进行去重、降序排序，打印年龄最大的两名作家的名字
        authors.stream()
                .distinct()
                .sorted((author1, author2) -> author2.getAge() - author1.getAge())
                .limit(2)
//                .limit(10)
                .forEach(author -> System.out.println(author.getName() + ":" + author.getAge()));
    }

    @Test
    public void test08() {
        // 对作家按年龄进行降序排序
        authors.stream()
                .distinct()
                /*.sorted(new Comparator<Author>() {
                    @Override
                    public int compare(Author o1, Author o2) {
                        return o2.getAge() - o1.getAge();
                    }
                })*/
                .sorted((author1, author2) -> author2.getAge() - author1.getAge())
                .forEach(author -> System.out.println(author.getName() + ":" + author.getAge()));
    }

    @Test
    public void test07() {
        authors.stream()
                .distinct()
                .forEach(author -> System.out.println(author.getName()));
    }

    @Test
    public void test06() {
        authors.stream()
                // 只对作家的姓名进行操作
                .map(author -> author.getName())
                .forEach(s -> System.out.println(s));

        authors.stream()
                .map(author -> author.getAge())
                .map(age -> age + 10)
                .forEach(age -> System.out.println(age));
    }

    @Test
    public void test05() {
        authors.stream()
                .distinct()
                .filter(author -> author.getName().length() > 1)
                .forEach(author -> System.out.println(author));
    }

    @Test
    public void test04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 24);
        map.put("李四", 27);
        map.put("王五", 30);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream = entries.stream();

        stream.filter(entry -> entry.getValue() > 26).
                forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }

    @Test
    public void test03() {
        Integer[] arr = {1, 2, 3, 4};
        Stream<Integer> stream = Arrays.stream(arr);
        stream.forEach(System.out::print);
        System.out.println();

        Stream.of(arr).forEach(System.out::print);
    }

    // 使用lambda表达式
    @Test
    public void test02() {
        authors.stream() // 把集合转换为stream流
                .distinct() // 去重
                .filter(author -> author.getAge() < 18) // 筛选出年龄小于18岁的作家
                .forEach(author -> System.out.println(author.getName())); // 将作家的名字打印输出
    }

    // 不用lambda表达式
    @Test
    public void test01() {
        // 打印所有年龄小于18的作家的名字(去重)
        // 将集合转换成流
        authors.stream()
                .distinct()
                .filter(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getAge() < 18;
                    }
                })
                .forEach(new Consumer<Author>() {
                    @Override
                    public void accept(Author author) {
                        System.out.println(author.getName());
                    }
                });

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
