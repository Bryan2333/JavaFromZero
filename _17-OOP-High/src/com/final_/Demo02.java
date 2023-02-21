package com.final_;

public class Demo02 {

}

class AA {

    public final double TAX_RATE = 0.5; //定义时赋值

    public static final double TAX_RATE4 = 0.5;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    {
        TAX_RATE3 = 0.5; //代码块中赋值
    }
    public AA() {
        TAX_RATE2 = 0.5; //构造器中赋值
    }
}