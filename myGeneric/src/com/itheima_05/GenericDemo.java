package com.itheima_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericDemo {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Objects>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        System.out.println("---------");

        //上限<? extends 类型>
//        List<? extends Number> list4 = new ArrayList<Objects>();
        List<? extends Number> list5 = new ArrayList<Integer>();
        List<? extends Number> list6 = new ArrayList<Number>();

        System.out.println("----------");
        //下限<? super 类型>
        List<? super Integer> list7 = new ArrayList<Number>();
        List<? super Integer> list8 = new ArrayList<Integer>();
    }
}
