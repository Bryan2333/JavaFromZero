package com.sell_ticket;

public class SellTicket {
    public static void main(String[] args) {
        /*SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();*/

        System.out.println("使用接口来售票");
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
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
