package com.interface_.demo01;

public class Computer {
    public void charge(UsbInterface usbInterface) {
        if (usbInterface != null) {
            //通过接口调用方法
            usbInterface.start();
            usbInterface.stop();
        }
    }
}
