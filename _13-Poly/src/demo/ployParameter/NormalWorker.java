package demo.ployParameter;

public class NormalWorker extends Employee{
    public NormalWorker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.printf("工人%s正在工作\n", getName());
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}
