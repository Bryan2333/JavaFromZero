package exercise02;

public class AssistantProfessor extends Teacher{
    private double salaryGrade = 1.2;

    public AssistantProfessor(String name, int age, String post, double salary) {
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
        String info = "Assistant Professor Info { " + super.toString() + " salary grade: " + salaryGrade + " }";
        System.out.println(info);
    }
}
