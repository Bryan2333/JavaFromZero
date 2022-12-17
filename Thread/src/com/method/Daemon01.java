package com.method;

public class Daemon01 {
    public static void main(String[] args) throws Exception {
        DaemonClass daemonClass = new DaemonClass();

        daemonClass.setDaemon(true);
        daemonClass.start();
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("主线程 Hello, World! " + i);
        }
    }
}

class DaemonClass extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("用户线程 Hello, Java");
        }
    }
}
