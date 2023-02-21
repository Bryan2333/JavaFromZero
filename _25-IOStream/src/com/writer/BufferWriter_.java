package com.writer;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class BufferWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void writer01() throws IOException {
        File file = new File(".\\test1.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

        bufferedWriter.write("Hello, BufferWriter");
        bufferedWriter.newLine();
        bufferedWriter.write("Hello, Java " + LocalDateTime.now());
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
