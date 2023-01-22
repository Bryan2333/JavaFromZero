package com.outputstream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "./data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据
        oos.writeInt(100); // int -> Integer
        oos.writeBoolean(true); // boolean -> Boolean
        oos.writeChar('A'); // char -> Character
        oos.writeDouble(0.55); // double -> Double
        oos.writeUTF("Hello, World!"); // String
        Employee emp = new Employee("Smith", 37, "中国", 8000);
        oos.writeObject(emp);

//        System.out.println(emp);
        oos.close();
        System.out.println("数据保存完毕");
    }
}
