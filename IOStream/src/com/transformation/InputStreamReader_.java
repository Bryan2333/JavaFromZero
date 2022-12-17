package com.transformation;

import org.junit.jupiter.api.Test;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void reader() throws IOException {
        String filePath = ".\\note.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);

        // 将 FileInputStream 转为 InputStreamReader
        InputStreamReader isr = new InputStreamReader(fileInputStream, "GBK");
        BufferedReader br = new BufferedReader(isr);

//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "GBK"));

        String line = null;
        line = br.readLine();
        System.out.println(line);

        br.close();
    }
}
