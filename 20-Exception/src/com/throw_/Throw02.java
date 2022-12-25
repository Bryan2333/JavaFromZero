package com.throw_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw02 {

    public static void m1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D://test");
    }
}

class Base {
    public void method() throws RuntimeException {

    }
}

class Sub extends Base {
    @Override
    public void method() throws ArithmeticException {
        super.method();
    }

}
