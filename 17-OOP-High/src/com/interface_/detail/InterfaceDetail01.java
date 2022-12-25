package com.interface_.detail;

public class InterfaceDetail01{
    public static void main(String[] args) {
        System.out.println();
    }
}

interface IB {

}

interface IC {
    int n1 = 100;
}

class Pig implements IB, IC {
    public void sayHi() {

    }
}