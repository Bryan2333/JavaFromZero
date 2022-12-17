package com.method;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("Tim");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.printf("hi %d\n", i);
        }
        t.interrupt();

        System.out.println(t.getName() + " 线程优先级=" + t.getPriority());
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 在工作 " + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + " 休眠中");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " 被打断了");
            }
        }
    }
}