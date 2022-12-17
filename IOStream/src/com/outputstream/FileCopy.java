package com.outputstream;

import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings("all")
public class FileCopy {
    public static void main(String[] args) {

    }

    @Test
    public void copy01() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String srcFile = ".\\sample.png";
        String destFile = ".\\result01.png";

        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int readLen;

            //读取一部分写入一部分
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, readLen); //有可能读取到最后没有1024个字节
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    @Test
    public void copy02() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String srcFile = ".\\sample.png";
        String destFile = ".\\result02.png";

        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            int data;
            //读取一部分写入一部分
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data); //有可能读取到最后没有1024个字节
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}