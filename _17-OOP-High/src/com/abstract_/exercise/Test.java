package com.abstract_.exercise;

public class Test {
    public static void main(String[] args) {
        Manager jack = new Manager("Jack", 0, 8000);
        jack.setBonus(10000);
        jack.work();

        CommonEmployee tom = new CommonEmployee("Tom", 1, 3000);
        tom.work();
    }
}
