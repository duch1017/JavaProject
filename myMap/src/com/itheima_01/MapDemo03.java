package com.itheima_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        System.out.println(map.get("A"));
        System.out.println(map.get("a"));

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        System.out.println("----------");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
