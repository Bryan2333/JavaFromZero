package ChapterExercise;

import java.util.function.DoubleFunction;

public class Exercise05 {
    public static void main(String[] args) {

        Circle circle1 = new Circle(4);
        circle1.showCircleArea();
        circle1.showCirclePerimeter();
    }
}

class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public void showCircleArea() {
        double area = Math.PI * r * r;
        System.out.printf("圆的面积 = %.3f\n", area);
    }

    public void showCirclePerimeter() {
        double perimeter = 2 * Math.PI * r;
        System.out.printf("圆的周长 = %.3f\n", perimeter);
    }
}