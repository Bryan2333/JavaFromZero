package com.string;

public class StringTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.exchange(person.name, person.ch);
        System.out.println(person.name);
        System.out.println(person.ch);
    }
}

class Person {
    String name = "Java";
    final char[] ch = {'R', 'u', 's', 't'};

    public void exchange(String name, char[] ch) {
        name = "C++";
        if (ch != null) {
            ch[0] = 'J';
        }
    }
}
