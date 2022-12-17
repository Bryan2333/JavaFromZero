package com.runnable_;

public class Runnable02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        ThreadProxy threadProxy = new ThreadProxy(cat);
        threadProxy.start();

    }
}

// 线程代理 模拟Thread类
class ThreadProxy implements Runnable {
    private Runnable target = null; //类型为Runnable的对象

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();
    }

    private void start0() {
        run();
    }
}

class Animal {}

class Cat extends Animal implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("cat %d %s\n", i, Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}