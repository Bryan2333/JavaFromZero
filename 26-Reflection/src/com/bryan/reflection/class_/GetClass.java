package com.bryan.reflection.class_;

import com.bryan.Cat;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;

/**
 * 讨论Class 类对象的方式
 */

public class GetClass {
    public static void main(String[] args) {

    }

    @Test
    //1. Class.forName(String str)
    public void firstMethod() throws Exception {
        String classPath = "com.bryan.Cat";
        Class<?> aClass = Class.forName(classPath);
        System.out.println(aClass);
    }

    @Test
    //2. 类名.class 文件
    public void secondMethod() throws Exception {
        Class<Cat> catClass = Cat.class;
        Constructor<Cat> declaredConstructor = catClass.getDeclaredConstructor();
        Cat cat = declaredConstructor.newInstance();
        System.out.println(cat);
        System.out.println(catClass);
    }

    @Test
    //3. 对象.getClass 有对象实例时可以使用
    public void thirdMethod() {
        Cat cat = new Cat();
        Class<? extends Cat> aClass = cat.getClass();
        System.out.println(aClass);
    }

    @Test
    //4. 通过类加载器 ClassLoader 获得类的 Class 对象
    public void fourthMethod() throws Exception {
        Cat cat = new Cat();
        // 先得到 cat 类的类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        // 在通过类加载器获得 Class 类对象
        Class<?> aClass = classLoader.loadClass("com.bryan.Cat");
        System.out.println(aClass);
    }

    @Test
    //5. 基本数据类型可以通过 基本数据类型.class 获得 Class 对象
    public void fifthMethod() {
        Class<Integer> integerClass = int.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(booleanClass);
        System.out.println(integerClass);
    }

    @Test
    //6. 基本数据类型的包装类可以通过 类型.TYPE 获得 Class 对象
    public void sixthMethod() {
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;
        System.out.println(type1);
        System.out.println(type);
    }

}
