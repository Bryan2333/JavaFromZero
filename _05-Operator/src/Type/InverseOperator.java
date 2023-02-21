package Type;

public class InverseOperator {
    public static void main(String[] args) {
        System.out.println(!(60 > 20));

        boolean b = (10 > 3) ^ ( 3 > 1);
        System.out.println("b = " + b);
    }
}
