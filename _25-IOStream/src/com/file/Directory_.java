package com.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void delete01() {
        File file = new File("D:\\test1.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    @Test
    public void delete02() {
        File file = new File("test");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("文件夹删除成功");
            } else {
                System.out.println("文件夹删除失败");
            }
        } else {
            System.out.println("文件夹不存在");
        }
    }

    @Test
    public void create01() {
        File testDirectory = new File("testDirectory");

        if (testDirectory.exists()) {
            System.out.println(testDirectory + "存在");
        } else {
            if (testDirectory.mkdir()) {
                System.out.println(testDirectory + "创建成功");
            } else {
                System.out.println(testDirectory + "创建失败");
            }
        }
    }

    @Test
    public void create02() {
        File testDirectory = new File("testDir\\subDir");

        if (testDirectory.exists()) {
            System.out.println(testDirectory + "存在");
        } else {
            if (testDirectory.mkdirs()) {
                System.out.println(testDirectory + "创建成功");
            } else {
                System.out.println(testDirectory + "创建失败");
            }
        }
    }

}
