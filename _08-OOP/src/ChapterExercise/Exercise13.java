package ChapterExercise;

public class Exercise13 {
    public static void main(String[] args) {
        PassObject po = new PassObject();
        po.printAreas(new Circle01(), 10);
    }
}

class Circle01 {
    double r;

    /*public Circle01(double r) {
        this.r = r;
    }*/

    public Circle01() {;}

    public void setR(double r) {
        this.r = r;
    }

    public double findArea() {
        return Math.PI * r * r;
    }
}

class PassObject {
    public void printAreas(Circle01 c, int times) {
        System.out.print("Radius\tArea\n");
        for (double r = 1; r <= times; r++) {
            c.setR(r);
            System.out.printf("%.1f\t%f\n", r, c.findArea());
        }
    }
}
