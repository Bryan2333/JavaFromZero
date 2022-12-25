package com.map_;

import java.util.*;

public class MapFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "C");
        map.put("2", "C++");
        map.put("3", "Java");

        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o + "-" + map.get(o));
        }
        System.out.println();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next + "-" + map.get(next));
        }
        System.out.println();

        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println();

        iterator = values.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println();

        Set set1 = map.entrySet();
        for (Object entry : set1) {
            Map.Entry mapEntry = (Map.Entry) entry;
            System.out.println(mapEntry.getKey() + "-" + mapEntry.getValue());
        }
        System.out.println();

        iterator = set1.iterator();
        while (iterator.hasNext()) {
            Object entry = iterator.next();
            Map.Entry mEntry = (Map.Entry) entry;
            System.out.println(mEntry.getKey() + "-" + mEntry.getValue());
        }
    }
}
