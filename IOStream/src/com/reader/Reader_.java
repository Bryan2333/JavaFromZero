package com.reader;

import org.junit.jupiter.api.Test;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("all")
public class Reader_ {
    public static void main(String[] args) {

    }

    @Test
    public void read01() {
        String fileName = ".\\write01.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName, StandardCharsets.UTF_8);
            int ch;
            while((ch = fileReader.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    @Test
    public void read02() {
        String fileName = ".\\write01.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName, StandardCharsets.UTF_8);
            char[] cbuf = new char[10];
            int readLen;

            while ((readLen = fileReader.read(cbuf)) != -1) {
                System.out.println(new String(cbuf, 0, readLen));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
