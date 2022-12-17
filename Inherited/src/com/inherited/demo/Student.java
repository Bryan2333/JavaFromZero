package com.inherited.demo;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.printf("学生名: %s 年龄: %d 成绩: %.1f\n", name, age, score);
    }

}
