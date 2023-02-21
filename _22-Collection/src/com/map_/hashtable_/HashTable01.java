package com.map_.hashtable_;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTable01 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        /*hashtable.put("123", null);
        hashtable.put(null, "123");*/

        hashtable.put("1", "Java");
        hashtable.put("1", "C++");

        Set set =  hashtable.keySet();
        Collection values = hashtable.values();
    }
}
