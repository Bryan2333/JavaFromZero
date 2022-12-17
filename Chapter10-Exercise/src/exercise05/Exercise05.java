package exercise05;

public class Exercise05 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}

class A {

    private String NAME = "A.张三";
    public void m1() {
        class B {
            private final String NAME = "B.张三";

            public void show() {
                System.out.println("B.name = " + NAME);
                System.out.println("A.name = " + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
