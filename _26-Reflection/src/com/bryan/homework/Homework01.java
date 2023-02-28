package com.bryan.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws Exception {
        // 得到 Class 对象
        Class<PrivateTest> cls = PrivateTest.class;
        PrivateTest pt = cls.getDeclaredConstructor().newInstance();

        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(pt, "Hi");
        Method getName = cls.getDeclaredMethod("getName");
        System.out.println(getName.invoke(pt));
    }
}

class PrivateTest {
    private String name = "Hello";

    public String getName() {
        return name;
    }

}
