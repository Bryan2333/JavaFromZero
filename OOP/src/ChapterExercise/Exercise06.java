package ChapterExercise;

public class Exercise06 {
    public static void main(String[] args) {

        Calculator cal1 = new Calculator(1.5, 0.5);
        System.out.println("和 = " + cal1.add());
        System.out.println("差 = " + cal1.sub());
        System.out.println("积 = " + cal1.mul());
        System.out.println("商 = " + cal1.div());

        System.out.println("---------------------");
        Calculator cal2 = new Calculator(0, 0);
        System.out.println("和 = " + cal2.add());
        System.out.println("差 = " + cal2.sub());
        System.out.println("积 = " + cal2.mul());
        System.out.println("商 = " + cal2.div());
    }
}

class Calculator {
    double num1;
    double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double sub() {
        return num1 - num2;
    }

    public double mul() {
        return num1 * num2;
    }

    public double div() {
        if (num2 == 0) {
            return (num1 >= 0) ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
        } else {
            return num1 / num2;
        }
    }
}