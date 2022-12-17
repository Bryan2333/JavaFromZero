package exercise02;

public class Professor extends Teacher{
    private double salaryGrade = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(double salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public void introduce() {
        String info = "Professor Info { " + super.toString() + " salary grade: " + salaryGrade + " }";
        System.out.println(info);
    }
}
