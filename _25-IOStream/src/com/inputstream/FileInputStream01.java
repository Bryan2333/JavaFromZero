package com.inputstream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void read01() throws IOException {
        String filePath = "hello.txt";
        int readData;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char)readData);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void read02() {
        File file = new File("hello.txt");
        FileInputStream fileInputStream = null;
        byte[] buffer = new byte[8];
        int readLen;

        try {
            fileInputStream = new FileInputStream(file);
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, readLen));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
