package com.inherited.super_;

public class B extends A{

    public void hi() {
        System.out.printf("%d %d %d", super.n1, super.n2, super.n3);
    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();
    }

    public void sum() {
        cal();
        //this.cal(); //相当于cal()
        //super.cal(); //跳过本类，直接查找父类
    }
}
