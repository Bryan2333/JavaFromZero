package com.demo;

public class CoreNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println("core num =   " + runtime.availableProcessors());
    }
}
