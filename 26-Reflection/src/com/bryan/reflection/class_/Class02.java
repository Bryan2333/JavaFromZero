package com.bryan.reflection.class_;

import com.bryan.Car;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws Exception {

        String classPath = "com.bryan.Car";
        // <?> 表示不确定的 Java 类型
        Class<?> cls = Class.forName(classPath);

        System.out.println(cls); // 输出哪个类的 Class 对象

        // 得到包名
        System.out.println(cls.getPackage().getName());

        // 得到全类名
        System.out.println(cls.getName());

        // 通过 cls 创建实例对象
        Car car = (Car) cls.getConstructor().newInstance();
        System.out.println(car);

        // 通过反射获得属性 band
        Field brand = cls.getField("brand");
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));

        // 通过反射获得所有字段
        System.out.println("=====所有的字段=====");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
