package dao;

import models.Student;

import java.util.List;

public interface Dao {
    void addStudent(Student student);

    void delStudentByStu_id(String stu_id);

    void updateStudent(String stu_id, Student student);

    List<Student> getAllStudent();

    List<Student> getStudentByName(String name);

//  通常学号不会重复，所以通过学号查询学生信息不需要用容器来储存对象
    Student getStudentByStu_id(String stu_id);
}
