package com.itheima_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        for (String s : array) {
            System.out.println(s);
        }

//        Iterator<String> it = array.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        System.out.println("-------------");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList) {
            System.out.println(s);
        }

//        Iterator<String> it = linkedList.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
