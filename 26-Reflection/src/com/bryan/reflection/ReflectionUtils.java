package com.bryan.reflection;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void firstGroup() throws Exception {
        Class cls = Class.forName("com.bryan.reflection.Employee");

        // getName : 获取全类名
        System.out.println(cls.getName());

        // getSimpleName : 获取简单类名
        System.out.println(cls.getSimpleName());

        // getFields : 获取所有由 public 修饰的属性，包含本类和父类
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // getDeclaredFields : 获取本类的所有属性
        System.out.println("=======本类所有属性=======");
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        // getMethods : 获取所有由 public 修饰的方法，包含本类和父类
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // getDeclaredMethods : 获取本类所有的方法
        System.out.println("=======本类所有方法=======");
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        // getConstructors : 获取所有由 public 修饰的构造器，仅包含本类
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // getDeclaredConstructor : 获取本类所有的构造器
        System.out.println("=======本类所有构造器=======");
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        // getPackage : 以 Package 返回信息包信息
        System.out.println(cls.getPackage());

        // getSuperClass : 以 Class 形式返回父类信息
        System.out.println(cls.getSuperclass());

        // getInterfaces : 以 Class[] 形式返回接口信息
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }

        // getAnnotations : 以 Annotation[] 形式返回注解信息
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

    @Test
    public void secondGroup() throws Exception {

        /*
            getModifier : 以 int 返回该属性的修饰符

            默认修饰符是 0
            public 是 1
            private 是 2
            protected 是 4
            static 是 8
            final 是 16

        * */

        // java.lang.reflect.Field
        Class<?> cls = Class.forName("com.bryan.reflection.Employee");
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName() + " 该属性的修饰符是 " + field.getModifiers() +
                    " 该属性的类型是 " + field.getType()
            );
        }

        // java.lang.reflect.Method
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + " 该方法的修饰符是 " + declaredMethod.getModifiers()
                    + " 该方法的返回类型是 " + declaredMethod.getReturnType()
            );

            // getParameterTypes : 以 Class[]形式 返回方法的参数类型
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的型参是 " + parameterType);
            }
        }

        // java.lang.reflect.Constructor
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的参数是 " + parameterType.getName());
            }
        }
    }
}

interface IPerson {}

interface IEmployee {}

class Person {
    public String hobby;

    public void f1() {}

    public Person() {}
}

@Disabled
class Employee extends Person implements IPerson, IEmployee {
    public String name;
    protected int age;
    String job;
    private double salary;

    // 方法
    public void m1(String name, int age, String job) {}

    protected void m2() {}

    void m3() {}
    private int m4() {return 0;}

    public Employee() {}

    public Employee(String name) {}

    private Employee(String name, int age) {}
}
