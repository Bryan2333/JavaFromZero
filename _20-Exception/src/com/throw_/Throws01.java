package com.throw_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws01 {
    public static void main(String[] args) {
        try {
            f1();
        } catch (Exception e) {

        }
    }

    public static void f1() throws Exception {
        FileInputStream fis = new FileInputStream("D://Test.txt");
    }
}
