package com.exit;

public class Exit01 {
    public static void main(String[] args) throws Exception {
        T t = new T();
        t.start();
        Thread.sleep(10 * 1000);
        t.setToContinue(false);
    }
}

class T extends Thread {

    private boolean toContinue = true;

    @Override
    public void run() {

        int count = 0;
        while (toContinue) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("count = %d\n", ++count);
        }
    }

    public void setToContinue(boolean toContinue) {
        this.toContinue = toContinue;
    }
}