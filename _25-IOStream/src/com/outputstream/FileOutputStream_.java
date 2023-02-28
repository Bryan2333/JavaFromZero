package com.outputstream;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void write01() throws IOException {
        File file = new File("write01.txt");
        String filePath = "write01.txt";
        FileOutputStream fileOutputStream1 = new FileOutputStream(file, false);//append为false,覆盖原有内容
        FileOutputStream fileOutputStream2 = new FileOutputStream(filePath, true); //append为true,不会覆盖原有内容

        //写一个字节
        //fileOutputStream.write('a');

        String str = "Hello, World!\n";
        fileOutputStream1.write(str.getBytes());
        fileOutputStream2.write(str.getBytes(), 0, str.length());
        fileOutputStream1.close();
        fileOutputStream2.close();

    }
}
