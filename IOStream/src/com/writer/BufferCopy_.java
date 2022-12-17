package com.writer;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferCopy_ {
    public static void main(String[] args) {

    }

    @Test
    public void copyChar() throws IOException {

        String srcFile = ".\\hello.txt";
        String destFile = ".\\testDirectory\\destHello.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFile));

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
