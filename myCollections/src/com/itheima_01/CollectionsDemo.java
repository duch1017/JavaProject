package com.itheima_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(10);
        System.out.println(list);

//        Collections.sort(list);
//        System.out.println(list);

//        Collections.reverse(list);
//        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
