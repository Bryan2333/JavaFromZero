package com.generic.custom;

public class CustomClass {
    public static void main(String[] args) {
        Tiger<Integer, Double, String> tigter = new Tiger<Integer, Double, String>("test", 1, 0.2, "hello");
        System.out.println(tigter);
    }
}

class Tiger<T, R, M> {
    String name;
    T t;
    R r;
    M m;


    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", t=" + t +
                ", r=" + r +
                ", m=" + m +
                '}';
    }
}