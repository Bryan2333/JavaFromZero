package exercise07;

public class Exercise07 {
    public static void main(String[] args) {
        Car car = new Car(-1);
        car.getAir().flow();
    }
}

class Car {
    private final double temperature;
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷气");
            } else if (temperature < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("空调关闭");
            }
        }
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public Air getAir() {
        return new Air();
    }
}