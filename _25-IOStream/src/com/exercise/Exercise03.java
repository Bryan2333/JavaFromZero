package com.exercise;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class Exercise03 {
    public static void main(String[] args) {

    }

    /* 创建 Dog 类对象，读取 dog.properties 用相应内容完成初始化 */
    @Test
    public void task2() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(".\\RelatedFile\\dog.properties"));

        String dogName = (String) properties.get("name");
        int dogAge = Integer.parseInt((String)properties.get("age"));
        String dogColor = (String) properties.get("color");

        Dog dog = new Dog(dogName, dogAge, dogColor);
        System.out.println(dog);
    }

    /* 创建一个 Dog 对象，并将其序列化输出到 dog.dat */
    @Test
    public void task3() throws IOException {
        Dog dog = new Dog("tom", 5, "black");

        File dest = new File(".\\RelatedFile\\dog.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dest));
        oos.writeObject(dog);
        oos.close();
    }

    @Test
    public void test() throws IOException, ClassNotFoundException {
        File file = new File(".\\RelatedFile\\dog.dat");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Dog dog = (Dog) ois.readObject();
        System.out.println(dog);
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    @Serial
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "Dog Info: name=%s age=%d color=%s\n".formatted(name, age, color);
    }
}
