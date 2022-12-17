package exercise04;

public class Farmer extends Employee{
    public Farmer(String name, double salary) {
        super(name, salary);
    }

    public void showAnnualSalary() {
        System.out.print("农民");
        super.showAnnualSalary();
    }
}
