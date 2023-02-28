package com.noInherited;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.printf("小学生%s，正在考数学\n", name);
    }

    public void showInfo() {
        System.out.printf("学生名: %s 年龄: %d 成绩: %.1f\n", name, age, score);
    }
}
