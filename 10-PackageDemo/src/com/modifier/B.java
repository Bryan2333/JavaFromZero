package com.modifier;

public class B {

    public void say() {
        A a = new A();
        //在同一个包
        System.out.printf("n1 = %d, n2 = %d, n3 = %d", a.n1, a.n2, a.n3);
    }
}
