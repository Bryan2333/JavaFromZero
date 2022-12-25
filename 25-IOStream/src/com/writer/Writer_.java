package com.writer;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("all")
public class Writer_ {
    public static void main(String[] args) {

    }

    @Test
    public void write01() {
        String fileName = ".\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'H', 'e', 'l', 'l', 'o'};

        try {
            fileWriter = new FileWriter(fileName, StandardCharsets.UTF_8, false);

            // fileWriter.write('A');
            // fileWriter.write(chars);
            // fileWriter.write(chars, 0, 3);
            fileWriter.write("风雨之后，定见彩虹");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void write02() throws IOException {
        String fileName = ".\\note.txt";
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ;
    }
}
