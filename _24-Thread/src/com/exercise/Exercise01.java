package com.exercise;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        t2.start();
        t1.start();
    }
}

class T1 extends Thread {
    private boolean toContinue = true;

    @Override
    public void run() {
        while (toContinue) {
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("T1线程退出");
    }

    public void setToContinue(boolean toContinue) {
        this.toContinue = toContinue;
    }
}

class T2 extends Thread {
    private final T1 t1;

    private final Scanner input = new Scanner(System.in);

    public T2(T1 t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入指令(Q): ");
            char key = input.next().charAt(0);

            if (key == 'Q') {
                t1.setToContinue(false);
                System.out.println("T2线程退出");
                break;
            }
        }
    }
}