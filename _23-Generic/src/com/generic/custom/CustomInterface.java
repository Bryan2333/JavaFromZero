package com.generic.custom;

public class CustomInterface {
    public static void main(String[] args) {

    }
}

interface IA<K, R> {
    R get(K k);

    void hi(R r);
}

//在继承接口时，指定泛型接口的类型
interface IB extends IA<String, Double> {

}

class A implements IB {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }
}

//实现接口时，指定泛型接口的类型
class B implements IA<String, Double> {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }
}

//如果没有指定泛型接口的类型，则默认为Object
class C implements IA {

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }
}