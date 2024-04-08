package com.itheima_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

//        list.add(2, "javaee");
//        list.add(5,"javaee");// IndexOutOfBoundsException

//        System.out.println(list.remove(1));
//        System.out.println(list.remove(11));// IndexOutOfBoundsException

//        System.out.println(list.set(1, "java"));
//        System.out.println(list.set(11, "java"));// IndexOutOfBoundsException

//        System.out.println(list.get(1));
//        System.out.println(list.get(11));// IndexOutOfBoundsException

//        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
