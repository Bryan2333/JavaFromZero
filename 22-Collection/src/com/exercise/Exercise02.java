package com.exercise;


import java.util.ArrayList;

public class Exercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        Car car1 = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        arrayList.add(car1);
        arrayList.add(car2);

        System.out.println(arrayList);

        //删除元素
        arrayList.remove(car1);

        //查找是否存在某个元素
        System.out.println(arrayList.contains(car1));

        //返回集合大小
        System.out.println(arrayList.size());

        //判断集合是否为空
        System.out.println(arrayList.isEmpty());

        //清空集合
//        arrayList.clear();
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        //查找多个元素是否存在
        System.out.println(arrayList.containsAll(arrayList));

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}