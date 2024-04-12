package com.itheima_08;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>();
        Random r = new Random();

        int num;
        while (set.size() < 10) {
            num = r.nextInt(20) + 1;
            set.add(num);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
