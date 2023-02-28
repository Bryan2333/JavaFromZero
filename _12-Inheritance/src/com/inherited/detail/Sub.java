package com.inherited.detail;

public class Sub extends Base{

    public Sub() {
        super("test", 18);
        System.out.println("子类Sub()构造器被调用");
    }

    public Sub(String name) {
        super("test", 20);
        System.out.println("子类Sub(String name)构造器被调用");
    }

    public Sub(String name, int age) {
        super();
    }

    public void sayOk() {
        //非私有的属性方法可以直接访问
        System.out.printf("%d %d %d\n", n1, n2, n3);
        test100();
        test200();
        test300();
        callTest400();
        System.out.printf("%d\n", getN4());
    }
}
