package exercise03;

public class Employee {
    private String name;
    private double daySal;
    private int workdays;
    private double grade;

    public Employee(String name, double daySal, int workdays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workdays = workdays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSalary() {
        System.out.printf("%s的总工资为%.0f元\n", name, daySal * workdays * grade);
    }
}
