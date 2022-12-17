package OverLoad;

public class Exercise02 {
    public static void main(String[] args) {

        Method method = new Method();
        System.out.println(method.max(1, 2));
        System.out.println(method.max(0.5, 0.4));
        System.out.println(method.max(0.1, 0.2, 30));
    }
}

class Method {

    public int max(int x, int y) {
        return x > y ? x : y;
    }

    public double max(double x, double y) {
        return x > y ? x : y;
    }

    public double max(double x, double y, double z) {
        return (x > max(y, z)) ? x : max(y, z);
    }
}