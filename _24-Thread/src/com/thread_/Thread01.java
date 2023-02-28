package com.thread_;

public class Thread01{
    public static void main(String[] args) {
        Person person = new Person();
        person.start();
        System.out.println("主线程继续执行main");
        for (int i = 0; i < 60; i++) {
            System.out.printf("主线程 i = %d\n", i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//1. 当一个类继承了Thread类，该类就可以当作线程类
//2. Thread类的run方法重写了Runnable接口的run方法
class Person extends Thread{
    @Override
    public void run() { // 重写run方法，写上自己的业务逻辑
        for (int i = 0; i < 80; i++) {
            System.out.printf("Hello, World %d 线程名称: %s\n", i, Thread.currentThread().getName());
            try {
                Thread.sleep(1000); //让该线程休息1秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
