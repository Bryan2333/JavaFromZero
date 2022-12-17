package exercise03;

public class CellPhone{
    public void testWork(CalInterface ci, double n1, double n2) {
        if (ci != null) {
            double result = ci.work(n1, n2);
            System.out.println("result = " + result);
        }
    }
}
