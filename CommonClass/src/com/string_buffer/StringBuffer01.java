package com.string_buffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        //第一种方法
        StringBuffer stringBuffer1 = new StringBuffer(str);

        //第二种方法
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2 = stringBuffer2.append(str);

        System.out.println(stringBuffer1);
        System.out.println(stringBuffer2);

        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        //第一种方法
        String str1 = stringBuffer.toString();

        //第二种方法
        String str2 = new String(stringBuffer);

        System.out.println(str1);
        System.out.println(str2);

        StringBuffer sb = new StringBuffer("Hello!");
        sb.insert(5, "Java");
        System.out.println(sb); //输出HelloJava!

    }
}
