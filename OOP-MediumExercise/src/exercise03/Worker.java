package exercise03;

public class Worker extends Employee{
    public Worker(String name, double daySal, int workdays, double grade) {
        super(name, daySal, workdays, grade);
    }

    public void printSalary() {
        super.printSalary();
    }
}
