package exercise03;

public class Test {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new CalInterface() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 9);

        cellPhone.testWork(new CalInterface() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 100);
    }
}
