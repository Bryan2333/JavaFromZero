package com.demo;

public class MultiThreads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        thread1.start(); //启动第一个线程
        thread2.start(); //启动第二个线程
    }
}

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello, World! %d\n", i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hi %d\n", i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}