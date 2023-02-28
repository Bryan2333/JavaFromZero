package demo.finalize;

public class Finalize {
    public static void main(String[] args) {

        Car bwm = new Car("BWM");
        bwm = null;
        System.out.println("程序退出!");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

}