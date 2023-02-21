package demo.ployParameter;

public class Tester {
    public static void main(String[] args) {
        NormalWorker work1 = new NormalWorker("张三", 5000);
        Manager manager1 = new Manager("李四", 10000, 2000);

        /*showEmpAnnual(work1);
        showEmpAnnual(manager1);
        work1.work();
        manager1.manage();*/


        testWork(work1);
        testWork(manager1);
    }

    public static void showEmpAnnual(Employee employee) {
        if (employee != null) {
            System.out.println(employee.getAnnual());
        }
    }

    public static void testWork(Employee employee) {
        if (employee != null) {
            if (employee instanceof NormalWorker) {
                ((NormalWorker) employee).work();
            } else if (employee instanceof Manager) {
                ((Manager) employee).manage();
            }
        }
    }
}
