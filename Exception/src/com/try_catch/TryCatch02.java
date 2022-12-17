package com.try_catch;

public class TryCatch02 {
    public static void main(String[] args) {
        try {
            Person p1 = new Person();
            p1 = null;
            System.out.println(p1.getName());
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally代码块");
        }

        System.out.println("程序继续!");
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}
