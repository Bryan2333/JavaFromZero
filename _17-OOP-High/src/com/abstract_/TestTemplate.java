package com.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.calculateTime();
    }
}


abstract class Tool {
    public abstract void job();

    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.printf("中间耗时%d毫秒\n", end-start);
    }
}

class AAA extends Tool {
    public void job() {
        long num = 1;
        for (int i = 1; i < 10000; i++) {
            num = num * i;
        }
    }
}


