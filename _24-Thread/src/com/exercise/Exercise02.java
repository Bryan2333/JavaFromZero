package com.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        Card card = new Card();
        new Thread(card).start();
        new Thread(card).start();
    }
}

class Card implements Runnable {
    private int balance = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (balance < 1000) {
                    break;
                }

                balance = balance - 1000;
                System.out.printf("%s 从卡里取了1000元 当前余额 = %d\n", Thread.currentThread().getName(), balance);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("%s 退出\n", Thread.currentThread().getName());
    }
}