package com.map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Map01 {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1", "Java");
        map.put("2", "Scheme");
        map.put("3", "Python");
        System.out.println(map);
        map.put("1", "C"); //将1对应的value从Java替换为C
        System.out.println(map);

        System.out.println(map.get("2"));

        map.remove("2");
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map);

        map.put("2", "Scheme");
        map.put("3", "Python");
        System.out.println(map.containsKey("3"));
        System.out.println(map.containsKey("4"));
    }
}
