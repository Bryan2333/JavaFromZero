package exercise03;

public class Manager extends Employee{
    private double bonus; //奖金

    public Manager(String name, double daySal, int workdays, double grade, double bonus) {
        super(name, daySal, workdays, grade);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void printSalary() {
        double totalSalary = getDaySal() * getWorkdays() * getGrade() + bonus;
        System.out.printf("%s的总工资为%.0f元\n", getName(), totalSalary);
    }
}
