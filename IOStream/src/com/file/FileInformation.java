package com.file;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    public void info() {
        File file = new File("D:\\test1.txt");

        System.out.println("文件名字 = " + file.getName());
        System.out.println("文件绝对路径 = " + file.getAbsolutePath());
        System.out.println("文件父目录 = " + file.getParent());
        System.out.println("文件大小(字节) = " + file.length());
        System.out.println("文件是否存在 = " + file.exists());
        System.out.println("是否为文件 = " + file.isFile());
        System.out.println("是否为目录 = " + file.isDirectory());

    }
}
