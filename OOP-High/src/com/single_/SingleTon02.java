package com.single_;

/**
 * 懒汉式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance2 = Cat.getInstance();
        System.out.println(instance2 == instance);
    }
}

// 希望在程序运行过程中，只能创建一个对象
class Cat {
    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小黄");
        }
        return cat;
    }
}