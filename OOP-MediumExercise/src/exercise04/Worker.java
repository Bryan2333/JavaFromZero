package exercise04;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void showAnnualSalary() {
        System.out.print("工人");
        super.showAnnualSalary();
    }
}
