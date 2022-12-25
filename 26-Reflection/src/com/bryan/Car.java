package com.bryan;

public class Car {
    public String brand = "宝马";
    public double price = 5000000;
    public String color = "白色";

    @Override
    public String toString() {
        return "band=%s, price=%.2f, color=%s".formatted(brand, price, color);
    }
}
