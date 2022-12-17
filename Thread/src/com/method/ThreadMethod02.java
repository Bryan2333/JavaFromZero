package com.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Hi %d\n", i);
            Thread.sleep(1000);
            if (i == 5) {
                System.out.println("让步给t2线程");
                System.out.println("t2线程已完成");
            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Hello %d\n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
