package com.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");

        Collections.swap(list, 1, 3);
        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(list);

        System.out.println(Collections.max(list));

        Object maxObj = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(maxObj);

        System.out.println(Collections.frequency(list, "tom")); //输出1

        List dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add(null);
        }
        Collections.copy(dest, list);
        System.out.println(dest);

        list.add("tom");
        System.out.println(list);
        Collections.replaceAll(list, "tom", "TOM");
        System.out.println(list);
    }
}
