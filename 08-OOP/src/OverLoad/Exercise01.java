package OverLoad;

public class Exercise01 {
    public static void main(String[] args) {

        Methods methods = new Methods();
        methods.m(3);
        methods.m(3,4);
        methods.m("Hello, World!");
    }
}

class Methods {

    public void m(int x) {
        System.out.println("result = " + (x * x));
    }

    public void m(int x, int y) {
        System.out.println("result = " + (x * y));
    }

    public void m(String str) {
        System.out.println(str);
    }
}