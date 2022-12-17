package com.collection_.set_.hashset_;

import java.util.HashSet;

public class HashSet01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("HashSet = " + hashSet);

        hashSet = new HashSet();
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        System.out.println("hashset = " + hashSet);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String toString() {
        return "HashCode = " + this.hashCode();
    }
}
