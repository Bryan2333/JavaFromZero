package exercise04;

public class Teacher extends Employee{
    private int classDay;
    private double classSal;

    public Teacher(String name, double salary, int classDay, double classSal) {
        super(name, salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public void showAnnualSalary() {
        double annualSalary = getSalary() * getSalMon() + classDay * classSal;
        System.out.print("教师");
        System.out.printf("%s的全年工资为%.0f\n", getName(), annualSalary);
    }
}
