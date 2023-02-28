package com.inherited.exercise01;

public class NotePad extends Computer{
    String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad信息: " + getDetails() + " 颜色: " + color);
    }
}
