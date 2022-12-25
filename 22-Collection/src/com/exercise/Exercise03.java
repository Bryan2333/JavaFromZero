package com.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);
        System.out.println(hashMap);

        hashMap.put("jack", 2600);
        System.out.println(hashMap);

        Set set = hashMap.keySet();
        for (Object key : set) {
            hashMap.put(key, (int) hashMap.get(key) + 100);
        }

        System.out.println("所有员工涨薪100元");
        System.out.println(hashMap);

        System.out.println("遍历所有员工");
        for (Object o : set) {
            System.out.println(o);
        }


        System.out.println("遍历所有工资");
        for (Object o : set) {
            System.out.println(hashMap.get(o));
        }

        System.out.println("遍历员工和薪资");
        Set entrySet = hashMap.entrySet();
        for (Object o : entrySet) {
            Map.Entry mEntry = (Map.Entry) o;
            System.out.println(mEntry.getKey() + "-" + mEntry.getValue());
        }
    }
}
