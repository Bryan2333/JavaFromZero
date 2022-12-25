package com.generic;

public class Generic02 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("Hello");
        System.out.println(person.f());
    }
}

class Person<E> {
    E s;

    public Person(E s) {
        this.s = s;
    }

    public E f() {
        return s;
    }
}
