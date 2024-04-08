package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
//        System.out.println(c.add("hello"));

        // add() 返回值永远为true
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);

        //remove() 含有需要删除的元素返回true，否则返回false
        System.out.println(c.remove("javaee"));
        System.out.println(c);

//        c.clear();
//        System.out.println(c);

        // contains() 判断集合中是否有给定的元素
        System.out.println(c.contains("javaee"));
        System.out.println(c);

        // isEmpty() 判断集合是否为空
        System.out.println(c.isEmpty());

        // size() 判断集合长度
        System.out.println(c.size());
    }
}
