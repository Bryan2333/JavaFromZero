package com.state;

public class ThreadState01 {
    public static void main(String[] args) throws Exception {
        T t = new T();
        System.out.printf("%s 状态 %s\n", t.getName(), t.getState());
        t.start();

        while (Thread.State.TERMINATED != t.getState()) {
            System.out.printf("%s 状态 %s\n", t.getName(), t.getState());
            Thread.sleep(500);
        }

        System.out.printf("%s 状态 %s\n", t.getName(), t.getState());
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("hi %d\n", i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}