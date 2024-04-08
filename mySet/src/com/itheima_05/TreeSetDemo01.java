package com.itheima_05;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(8);
        ts.add(4);
        ts.add(2);
        ts.add(1);

        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
