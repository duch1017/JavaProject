package com.itheima_03;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
        Arrays.sort(intArray);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                sb.append(intArray[i]);
            } else {
                sb.append(intArray[i]).append(" ");
            }
        }
        String s1 = sb.toString();
        System.out.println(s1);
    }
}
