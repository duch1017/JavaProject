package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

//        System.out.println(map.remove("A"));
//        System.out.println(map.remove("a"));

//        map.clear();

//        System.out.println(map.containsKey("a"));
//        System.out.println(map.containsKey("A"));

//        System.out.println(map.containsValue("A"));
//        System.out.println(map.containsValue("a"));

//        System.out.println(map.isEmpty());

        System.out.println(map.size());

        System.out.println(map);
    }
}
