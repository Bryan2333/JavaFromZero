package com.interface_.demo01;

public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("开始给相机充电");
    }

    @Override
    public void stop() {
        System.out.println("停止给相机充电");
    }
}
