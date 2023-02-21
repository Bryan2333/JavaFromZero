package ChapterExercise;

public class Exercise12 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("张三", '男', 21, "经理", 10000);
    }
}

class Employee {
    String name;
    char sex;
    int age;
    String position; //职位
    double salary;

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String name, char sex, int age, String position, double salary) {
        this(name, sex, age);
        this.salary = salary;
        this.position = position;
    }




}
