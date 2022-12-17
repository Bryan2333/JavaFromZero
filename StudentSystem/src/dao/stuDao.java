package dao;

import factory.ConnectionFactory;
import models.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class stuDao implements Dao {

    Connection conn = null;

    public stuDao() {
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student) {
        if (student == null) {
            return;
        }

        String sql = "insert into student(name, age, sex, major, grade, stu_id)"
                + "values(?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, student.getName());
            pst.setInt(2, student.getAge());
            pst.setString(3, student.getSex());
            pst.setString(4, student.getMajor());
            pst.setString(5, student.getGrade());
            pst.setString(6, student.getStu_id());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delStudentByStu_id(String stu_id) {
        String sql = "delete from student where stu_id = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, stu_id);

            pst.executeUpdate();
//            resetIncrement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(String stu_id, Student student) {
//        if(!(student instanceof Student))
        if (student == null) {
            return;
        }
        String sql = "update student set name = ?, age = ?, "
                + "sex = ?, major = ?, grade = ?, stu_id = ? "
                + "where stu_id = ?";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, student.getName());
            pst.setInt(2, student.getAge());
            pst.setString(3, student.getSex());
            pst.setString(4, student.getMajor());
            pst.setString(5, student.getGrade());
            pst.setString(6, student.getStu_id());
            pst.setString(7, stu_id);

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudent() {
        String sql = "select * from student";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            List<Student> list = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setSex(rs.getString("sex"));
                student.setMajor(rs.getString("major"));
                student.setGrade(rs.getString("grade"));
                student.setStu_id(rs.getString("stu_id"));
                list.add(student);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student getStudentByStu_id(String stu_id) {
        String sql = "select * from student where stu_id = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, stu_id);
            ResultSet rs = pst.executeQuery();
            Student student = new Student();
            while (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setSex(rs.getString("sex"));
                student.setMajor(rs.getString("major"));
                student.setGrade(rs.getString("grade"));
                student.setStu_id(rs.getString("stu_id"));
            }
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Student> getStudentByName(String name) {
        String sql = "select * from student where name = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            List<Student> list = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setSex(rs.getString("sex"));
                student.setMajor(rs.getString("major"));
                student.setGrade(rs.getString("grade"));
                student.setStu_id(rs.getString("stu_id"));
                list.add(student);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    为了在删除学生信息后保持id顺序，添加了一个重置ID auto_increment 的方法
//    public void resetIncrement()
//    {
//        String sql1 = "ALTER TABLE student drop id";
//        String sql2 = "ALTER TABLE student add id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT FIRST";
//        try
//        {
//            PreparedStatement pst1 = conn.prepareStatement(sql1);
//            PreparedStatement pst2 = conn.prepareStatement(sql2);
//            pst1.executeUpdate();
//            pst2.executeUpdate();
//        }
//        catch(SQLException e)
//        {
//            e.printStackTrace();
//        }
//    }
}


