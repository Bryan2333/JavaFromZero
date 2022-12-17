package exercise02;

public class Instructor extends Teacher{
    private double salaryGrade = 1.1;

    public Instructor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salaryGrade = salaryGrade;
    }

    public double getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(double salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public void introduce() {
        String info = "Instructor Info { " + super.toString() + " salary grade: " + salaryGrade + " }";
        System.out.println(info);
    }
}
