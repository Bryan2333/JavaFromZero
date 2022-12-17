package com.interface_.interfacePloyArr;

public class Demo01 {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera();


        for (var i : usbs) {
            i.work();
            if (i instanceof Phone_) {
                ((Phone_) i).call();
            }
        }
    }
}

interface Usb{
    void work();
}

class Phone_ implements Usb{
    public void call() {
        System.out.println("手机可以打电话");
    }

    public void work() {
        System.out.println("手机工作中");
    }
}
class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}