package com.itheima_03;

public class IntegerDome {
    public static void main(String[] args) {
        // int --> String
        int num = 100;
        String s1 = "" + num;
        System.out.println(s1);

        String s2 = String.valueOf(num);
        System.out.println(s2);
        System.out.println("--------");

        // String --> int
        String str = "100";
        Integer i = Integer.valueOf(str);
//        System.out.println(i.getClass());
        int i1 = i.intValue();
        System.out.println(i1);

        int i2 = Integer.parseInt(str);
        System.out.println(i2);
    }
}
