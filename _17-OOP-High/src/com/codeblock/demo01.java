package com.codeblock;

public class demo01 {
    public static void main(String[] args) {

        Moive moive = new Moive("test", 100, "test");
    }
}

class Moive {
    private String name;
    private double price;
    private String director;

    public Moive(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("构造器被调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
    }

}