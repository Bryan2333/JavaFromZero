package com.outputstream;

import java.io.Serializable;

public class Company implements Serializable {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
