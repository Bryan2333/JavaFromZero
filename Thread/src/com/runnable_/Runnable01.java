package com.runnable_;

public class Runnable01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //创建一个Thread对象，将dog对象放入Thread
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Dog %d %s\n", i, Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}