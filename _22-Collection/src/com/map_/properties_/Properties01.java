package com.map_.properties_;

import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("123", "Java");
        properties.put("1", new Person());

        /*boolean ifSame = properties.get("123") == properties.getProperty("123");
        System.out.println(ifSame);*/

        System.out.println(properties.get("1"));
        System.out.println(properties.getProperty("1"));
    }
}

class Person {

    @Override
    public String toString() {
        return "Person{}";
    }
}