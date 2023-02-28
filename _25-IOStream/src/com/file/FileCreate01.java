package com.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate01 {
    public static void main(String[] args) {

    }

    //
    @Test
    public void create01() {
        String filePath = "test1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void create02() {
        File parentFile = new File("D:\\");
        String fileName = "test2.txt";

        //file对象在Java程序中只是对象而已，让在内存中
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile(); //执行了createNewFile()才会真正在硬盘中创建文件地方
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void create03() {
        String parentPath = "D:\\";
        String fileName = "test3.txt";

        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
