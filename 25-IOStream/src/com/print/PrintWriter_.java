package com.print;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(".\\PrintWriter.txt");
        printWriter.println("Hello, Caddy");
        printWriter.close();
    }
}
