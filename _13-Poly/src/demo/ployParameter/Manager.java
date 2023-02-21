package demo.ployParameter;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manage() {
        System.out.printf("经理%s正在管理", getName());
    }

}
