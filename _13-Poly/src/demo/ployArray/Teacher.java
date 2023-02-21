package demo.ployArray;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String printInfo() {
        return "教师信息：" + super.printInfo() + " 薪水：" + getSalary();
    }

    public void teach() {
        System.out.printf("老师%s正在授课\n", getName());
    }

}
