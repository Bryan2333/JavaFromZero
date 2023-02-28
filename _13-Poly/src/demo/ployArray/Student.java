package demo.ployArray;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String printInfo() {
        return "学生信息：" + super.printInfo() + " 成绩：" + getScore();
    }

    public void learn() {
        System.out.printf("学生%s正在学习\n", getName());
    }
}
