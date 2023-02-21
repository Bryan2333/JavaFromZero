package com.abstract_;

public class Demo02 {

}

abstract class A {

    public void sayHello() {
        System.out.println("hello");
    }

    public abstract void sayHi();
}

class B extends A {

    public void sayHi() {

    }
}

abstract class AA {
   // private abstract void hi();
}