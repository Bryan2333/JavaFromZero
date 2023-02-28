package com.innerclass_.annoymous_.exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        m1(new IA() {
            @Override
            public void show() {
                System.out.println("这是一幅名画");
            }
        });
    }

    public static void m1(IA ia) {
        if (ia != null) {
            ia.show();
        }
    }
}

interface IA {
    void show();
}
