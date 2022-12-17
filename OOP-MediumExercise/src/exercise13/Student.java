package exercise13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }


    public void study() {
        System.out.println("我承诺，我会好好学习!");
    }

    public String play() {
        return super.play() + "足球";
    }

    public String toString() {
        return "学生的信息:" + '\n'
                + super.toString()
                + "学号: " + stu_id + '\n'
                + play();
    }

    public void printInfo() {
        System.out.println(this);
        study();
    }
}
