package exercise04;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void showAnnualSalary() {
        double annualSalary = getSalary() * getSalMon() + bonus;
        System.out.print("科学家");
        System.out.printf("%s的全年工资为%.0f\n", getName(), annualSalary);
    }
}
