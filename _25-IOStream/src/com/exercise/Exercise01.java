package com.exercise;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise01 {
    public static void main(String[] args) {

    }

    @Test
    public void task1() {
        File dirPath = new File(".\\mytemp");
        if (dirPath.exists()) {
            System.out.println("文件夹已存在");
        } else {
            if (dirPath.mkdir()) {
                System.out.println("文件夹创建成功");
            } else {
                System.out.println("文件夹创建失败");
            }
        }
    }

    @Test
    public void task2() throws IOException {
        File file = new File(".\\mytemp\\hello.txt");

        if (!file.exists()) {
            System.out.println("文件不存在");
            if (file.createNewFile()) {
                System.out.println("文件创建成功");
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write("Hello,Java");
                bw.close();
            } else {
                System.out.println("文件创建失败");
            }
        } else {
            System.out.println("文件已存在");
        }
    }
}
