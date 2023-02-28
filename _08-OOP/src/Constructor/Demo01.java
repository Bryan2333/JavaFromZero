package Constructor;

import java.sql.SQLOutput;

public class Demo01 {
    public static void main(String[] args) {


        Person p1 = new Person("张三", 18);
        System.out.println("p1.name = " + p1.name + ", p1.age = " + p1.age);

        Person p2 = new Person(20);
        System.out.println("p2.name = " + p2.name + ", p1.age = " + p2.age);

        Person p3 = new Person("李四");
        System.out.println("p3.name = " + p3.name + ", p3.age = " + p3.age);

        Person p4 = new Person();
        System.out.println("p4.name = " + p4.name + ", p4.age = " + p4.age);
    }
}

class Person {

    public String name;
    public int age;

    public Person(String initName, int initAge) {
        this.name = initName;
        this.age = initAge;
    }

    public Person() {}

    public Person(int initAge) {
        this.age = initAge;
    }

    public Person(String initName) {
        this.name = initName;
    }
}