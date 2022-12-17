package exercise04;

public class Employee {
    private String name;
    private double salary;
    private int salMon = 12;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalMon(int salMon) {
        this.salMon = salMon;
    }

    public int getSalMon() {
        return salMon;
    }

    public void showAnnualSalary() {
        double annualSalary = salary * salMon;
        System.out.printf("%s的全年工资为%.0f\n", name, annualSalary);
    }
}
