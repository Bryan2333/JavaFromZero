package com.innerclass_.annoymous_.exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了！！！！");
            }
        });

        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上了课！！！");
            }
        });
    }
}

interface Bell {
    void ring();
}

class Phone {
    public void alarmClock(Bell bell) {
        if (bell != null) {
            bell.ring();
//            System.out.println(bell.getClass());
        }
    }
}