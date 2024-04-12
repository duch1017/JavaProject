package com.itheima_06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
//        list.add("java");//UnsupportedOperationException
        list.set(1, "java");
        System.out.println(list);
    }
}
