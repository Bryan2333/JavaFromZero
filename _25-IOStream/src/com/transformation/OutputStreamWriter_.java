package com.transformation;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void writer() throws IOException {
        String filePath = "./note.txt";
        FileOutputStream fos = new FileOutputStream(filePath, false);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Hello, Programming");
        bw.newLine();
        bw.write("使用OutputStreamWriter");
        bw.close();
    }
}
