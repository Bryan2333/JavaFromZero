package com.inputstream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferedInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void copyByte() throws IOException {

        String srcFilePath = ".\\sample.png";
        String destFilePath = ".\\testDirectory\\result03.png";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFilePath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath, false));

        byte[] bytes = new byte[1024];
        int byteLength = 0;
        while ((byteLength = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, byteLength);
        }
        System.out.println("文件复制完毕");

        bis.close();
        bos.close();
    }

    @Test
    public void copyChar() throws IOException {
        String srcFilePath = ".\\testDirectory\\destHello.txt";
        String destFilePath = ".\\testDirectory\\destHello1.txt";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFilePath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

        byte[] bytes = new byte[1024];
        int length = 0;

        while ((length = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, length);
        }

        bis.close();
        bos.close();

    }
}