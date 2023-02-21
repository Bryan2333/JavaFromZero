package com.io;

public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFile();
        System.out.println();
        bufferedReader_.readFiles(10);

        bufferedReader_ = new BufferedReader_(new StringReader_());
        bufferedReader_.readStrings(10);
    }
}
