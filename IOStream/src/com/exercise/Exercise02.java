package com.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise02 {
    public static void main(String[] args) throws IOException {

        File file = new File(".\\RelatedFile\\exercise02.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = null;
        int count = 0;
        while ((line = br.readLine()) != null) {
            count++;
            System.out.printf("%d%s\n", count, line);
        }
        System.out.println();

        br.close();
    }
}
