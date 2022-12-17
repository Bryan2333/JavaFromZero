package studentsystem;

import models.Student;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args)
    {
        Student stu1 = new Student("张三", 18, "男", "软件工程", "大一", "212541");
        Student stu2 = new Student(null, 18, "男", "软件工程", "大一", "11111");
        //Student stu3 = new Student(null, 19, "男", "CS", "大一", "1111");
        //Student stu3 = null;
        //System.out.println(stu3.getName().toUpperCase());
        System.out.println(stu1);
    }
}
