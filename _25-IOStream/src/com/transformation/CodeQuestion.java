package com.transformation;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) {

    }

    @Test
    public void read() throws IOException {
        String filePath = ".\\note.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line = null;
        line = bufferedReader.readLine();
        System.out.println(line);

        bufferedReader.close();
    }
}
