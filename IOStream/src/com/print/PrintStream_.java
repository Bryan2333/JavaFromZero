package com.print;


import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        String str = null;

        out.write("hello".getBytes());
        out.println("hello, print");
        out.close();

        System.setOut(new PrintStream(".\\PrintStream.txt"));
        System.out.write("hello".getBytes());
    }
}
