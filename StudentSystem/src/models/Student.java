package models;

public class Student {

    private int id; //学生编号

    private String name; //学生姓名

    private int age; //学生年龄

    private String sex; //学生性别

    private String major; //学生的专业

    private String grade; //学生所处的年级

    private String stu_id; //学生学号

    public Student() {
    }

    public Student(String name, int age, String sex, String major, String grade, String stu_id) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
        this.grade = grade;
        this.stu_id = stu_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        String stuInfo = "--------------" + '\n' +
                "ID：" + id + '\n' +
                "姓名：" + name + '\n' +
                "年龄：" + age + '\n' +
                "性别：" + sex + '\n' +
                "专业：" + major + '\n' +
                "年级：" + grade + '\n' +
                "学号：" + stu_id + '\n' +
                "--------------" + '\n';
        return stuInfo;
    }
}
