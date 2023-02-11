package com.bryan.homework;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws Exception {
        // 获取 File类的 Class对象
        Class<File> fileClass = java.io.File.class;

        // 通过反射获取 File类的所有构造器
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        // 通过反射获取参数为 String 的构造器
        Constructor<File> constructor = fileClass.getDeclaredConstructor(String.class);
        // 通过该构造器创建 File 对象
        File file = constructor.newInstance("./mynewfile.txt");
        // 通过反射获得 createNewFile 方法
        Method createNewFile = fileClass.getDeclaredMethod("createNewFile");
        createNewFile.invoke(file); // 调用 createNewFile 方法
    }
}
