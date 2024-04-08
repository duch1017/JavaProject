package com.itheima_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
