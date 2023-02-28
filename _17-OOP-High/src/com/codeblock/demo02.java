package com.codeblock;

public class demo02 {
    public static void main(String[] args) {

//        AA aa = new AA();

//        System.out.println(Cat.n1);
        System.out.println(DD.n1);
    }
}


class Animal {
    static {
        System.out.println("Animal 类的静态代码块被调用");
    }
}
class Cat extends Animal{
    public static int n1 = 100;

    static {
        System.out.println("Cat 类的静态代码块被执行!");
    }
}

class BB {

    static {
        System.out.println("BB 类的静态代码块被执行!");
    }

}

class AA extends BB{

    static {
        System.out.println("AA 类的静态代码块被执行!");
    }
}

class DD {
    static {
        System.out.println("DD 类的静态代码块被调用");
    }

    {
        System.out.println("DD 类的普通代码块被调用");
    }

    public static int n1 = 100;
}

