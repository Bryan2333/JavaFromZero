package com.interface_.demo01;

public class Phone implements UsbInterface{

    public void start() {
        System.out.println("开始给手机充电");
    }

    public void stop() {
        System.out.println("停止给手机充电");
    }
}
