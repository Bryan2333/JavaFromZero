package exercise04;

public class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    public void showAnnualSalary() {
        System.out.print("服务员");
        super.showAnnualSalary();
    }
}
