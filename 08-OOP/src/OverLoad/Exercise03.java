package OverLoad;

public class Exercise03 {
    public static void main(String[] args) {

        Student stu1 = new Student();
        System.out.println(stu1.showScore("Bryan", 90.0, 80.0, 70.0));
    }
}

class Student {

    public String showScore(String name, double... scores) {
        if (name != null && scores != null) {
            int sum = 0;
            for (double i : scores) {
                sum += i;
            }
            return "姓名: " + name + ", 总分: " + sum;
        } else {
            return null;
        }
    }
}