package com.bryan.reflection;

import java.lang.reflect.Method;

public class ReflectCallMethod {
    public static void main(String[] args) throws Exception {
        // 得到People类的Class对象
        Class<?> peopleCls = Class.forName("com.bryan.reflection.People");
        // 通过反射创建 People类的对象
        People peo1 = (People) peopleCls.getDeclaredConstructor().newInstance();
        // 通过反射获取 say 方法
        Method hi = peopleCls.getDeclaredMethod("hi", String.class, int.class);
        hi.invoke(peo1, "学生", 24);

        Method say = peopleCls.getDeclaredMethod("say", String.class, int.class);
        say.setAccessible(true);
        // 在反射中，如果方法有返回值，则统一返回 Object类，但实际运行类型与方法定义的返回类型一致
        System.out.println(say.invoke(peo1, "张三", 25));
        System.out.println(say.invoke(null, "张三", 25));
        System.out.println(say.invoke(null, "张三", 26).getClass());
    }
}

class People {
    public int age;

    private static String name;

    public People() {}

    private static String say(String name, int n) {
        return String.format("%s %d", name, n);
    }

    public void hi(String name, int n) {
        System.out.println(name + " " + n);
    }
}
