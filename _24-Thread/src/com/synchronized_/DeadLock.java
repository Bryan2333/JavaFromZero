package com.synchronized_;

public class DeadLock {
    public static void main(String[] args) {
        lock lock1 = new lock(true);
        lock lock2 = new lock(false);

        lock1.start();
        lock2.start();
    }
}

class lock extends Thread {
    public static final Object o1 = new Object();
    public static final Object o2 = new Object();

    private final Boolean flag;

    public lock(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.printf("%s 进入 1\n", Thread.currentThread().getName());
                synchronized (o2) {
                    System.out.printf("%s 进入 2\n", Thread.currentThread().getName());
                }
            }
        } else {
            synchronized (o2) {
                System.out.printf("%s 进入 3\n", Thread.currentThread().getName());
                synchronized (o1) {
                    System.out.printf("%s 进入 4\n", Thread.currentThread().getName());
                }
            }
        }
    }
}