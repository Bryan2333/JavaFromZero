package com.innerclass_.member_innerclass;

public class MemberInnerclass01 {
    public static void main(String[] args) {
//        Outer.Inner myInner = new Outer().new Inner();

        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();
        /*Outer.Inner myInner = myOuter.getInnerInstance();
        myInner.say();*/
    }
}

class Outer {
    private int n1 = 100;
    public String name = "张三";

    class Inner {
        private int n2 = 100;

        public void say() {
            System.out.printf("n1 = %d, name = %s\n", n1, name);
        }
    }

    public void m1() {
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.n2);
    }

    public Inner getInnerInstance() {
        Inner inner = new Inner();
        return inner;
    }
}
