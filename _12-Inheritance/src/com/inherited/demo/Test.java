package com.inherited.demo;

public class Test {
    public static void main(String[] args) {

        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 12;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "张三";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();
    }
}
