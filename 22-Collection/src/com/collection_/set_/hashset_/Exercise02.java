package com.collection_.set_.hashset_;

import javax.naming.BinaryRefAddr;
import java.util.HashSet;
import java.util.Objects;

public class Exercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Worker worker1 = new Worker("Smith", new MyDate(2000, 12, 1));
        Worker worker2 = new Worker("Smith", new MyDate(2000, 12, 1));
        Worker worker3 = new Worker("Smith", new MyDate(2000, 11, 3));
        Worker worker4 = new Worker("Peter", new MyDate(2000, 11, 3));

        hashSet.add(worker1);
        hashSet.add(worker2);
        hashSet.add(worker3);
        hashSet.add(worker4);

        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}

class Worker {
    private String name;
    private MyDate birthday;

    public Worker(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) && Objects.equals(birthday, worker.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}