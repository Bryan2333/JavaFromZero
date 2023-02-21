package com.custom_exception;

public class Demo01 {
    public static void main(String[] args) {

        int age = 17;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18~120之间");
        }
        System.out.println("你的年龄正确");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}