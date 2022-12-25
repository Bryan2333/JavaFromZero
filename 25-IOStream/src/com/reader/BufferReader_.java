package com.reader;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void reader01() throws IOException {

        File file = new File(".\\src\\com\\reader\\BufferReader_.java");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        //用BufferReader读取文件
        String line;

        //readLine 如果到达文件末尾，则返回null
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
