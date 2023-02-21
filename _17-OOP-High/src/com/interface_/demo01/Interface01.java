package com.interface_.demo01;

public class Interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // Phone实现了UsbInterface接口
        Phone phone = new Phone();

        // Camera实现了UsbInterface接口
        Camera camera = new Camera();
        computer.charge(camera);
        System.out.println("---------------------");
        computer.charge(phone);
    }
}
