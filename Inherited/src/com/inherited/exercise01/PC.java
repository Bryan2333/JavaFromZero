package com.inherited.exercise01;

public class PC extends Computer {
    private String band;

    public PC(String cpu, int memory, int disk, String band) {
        super(cpu, memory, disk);
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void printInfo() {
        System.out.println("PC信息: " + getDetails() + " 品牌: " + band);
    }
}
