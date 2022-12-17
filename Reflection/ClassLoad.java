import java.util.*;
import java.lang.reflect.*;

public class ClassLoad {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();
        switch(key) {
            case "1" -> {
                Dog dog = new Dog();
                dog.eat();
            }
            case "2" -> {
                Class cls = Class.forName("Person");
                Object o = cls.getDeclaredConstructor().newInstance();
                Method m = cls.getMethod("hi");
                m.invoke(o);
                System.out.println("ok");
            }
        }
    }
}

class Dog {
    public void eat() {
        System.out.println("eating");
    }
}

class Person {
    public void hi() {
        System.out.println("hi");
    }
}
