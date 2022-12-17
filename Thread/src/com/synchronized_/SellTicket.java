package com.synchronized_;

public class SellTicket {
    public static void main(String[] args) {
        /*SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();*/

//        System.out.println("使用接口来售票");
        /*SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();*/

        SellTicket04 sellTicket04 = new SellTicket04();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();



    }
}

class SellTicket04 implements Runnable {
    private int ticketNum = 500;
    private boolean toContinue = true;

    private final Object obj = new Object();

    public /*synchronized*/ void  sell() {
        // synchronized修饰代码块
        synchronized (/*this*/ obj) { //
            if (ticketNum <= 0) {
                System.out.printf("窗口%s 票已卖完!\n", Thread.currentThread().getName());
                toContinue = false;
                return;
            }

            //模拟休眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.printf("窗口%s 售出一张票, 剩余票数: %d\n", Thread.currentThread().getName(), --ticketNum);
        }
    }

    @Override
    public void run() {
        while (toContinue) {
            sell();
        }
    }
}

class SellTicket03 implements Runnable {
    private int ticketNum = 500;

    private boolean toContinue = true;


    //同步方法
    public synchronized void sell() {
        if (ticketNum <= 0) {
            System.out.printf("窗口%s 票已卖完!\n", Thread.currentThread().getName());
            toContinue = false;
            return;
        }

        //模拟休眠
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("窗口%s 售出一张票, 剩余票数: %d\n", Thread.currentThread().getName(), --ticketNum);
    }

    @Override
    public void run() {
        while (toContinue) {
            sell();
        }
    }
}

class SellTicket01 extends Thread {

    private int ticketNum = 100; //多个线程共享ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票已卖完!");
                break;
            }

            //模拟休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.printf("窗口%s 售出一张票, 剩余票数: %d\n", Thread.currentThread().getName(), --ticketNum);
        }
    }
}

class SellTicket02 implements Runnable {
    private int ticketNum = 100; //多个线程共享ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票已卖完!");
                break;
            }

            //模拟休眠
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.printf("窗口%s 售出一张票, 剩余票数: %d\n", Thread.currentThread().getName(), --ticketNum);
        }
    }
}
