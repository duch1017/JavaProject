package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("001", "张三");
        map.put("002", "李四");
        System.out.println(map);
    }
}
