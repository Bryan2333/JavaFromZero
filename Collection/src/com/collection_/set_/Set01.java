package com.collection_.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("jack");
        set.add("tom");
        set.add("peter");
        set.add("smith");
        set.add("tim");
        set.add(null);
        set.add(null);

        //方式一：使用迭代器遍历set
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        //方式二：使用增强for循环遍历集合
        System.out.println("===============");
        for (Object o : set) {
            System.out.println(o);
        }

        set.clear();
        System.out.println("set = " + set);
    }
}
