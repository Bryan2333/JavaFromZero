package com.interface_.vs_extends;

public class ExtendsVSInterface {
    public static void main(String[] args) {
        LittleMonkey monkey = new LittleMonkey("Monkey");
        monkey.climbing();
        monkey.swimming();
        monkey.flying();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println("猴子会爬树");
    }

    public String getName() {
        return name;
    }
}

interface Fish {
    void swimming();
}

interface Bird {
    void flying();
}

class LittleMonkey extends Monkey implements Fish, Bird {
    public LittleMonkey(String name) {
        super(name);
    }

    public void swimming() {
        System.out.println(getName() + "通过学习，可以向鱼儿一样游泳");
    }

    public void flying() {
        System.out.println(getName() + "通过学习，可以向鸟一样飞翔");
    }
}