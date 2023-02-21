package OverLoad;

import java.sql.SQLOutput;

public class Demo01 {
    public static void main(String[] args) {

        // println方法的重载
        /*System.out.println(1);
        System.out.println("Hello, World!");
        System.out.println(true);
        System.out.println('A');
        System.out.println(0.5);*/

        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 1));
        System.out.println(cal.add(0.5, 1));
        System.out.println(cal.add(1, 1.5));
        System.out.println(cal.add(1, 2, 3));
    }

}

class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public double add(int x, double y) {
        return x + y;
    }

    public double add(double x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}