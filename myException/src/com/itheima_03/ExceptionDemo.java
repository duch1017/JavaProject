package com.itheima_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
//        method();
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    // 运行时异常
   /* public static void method() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }*/

    // 编译时异常
    public static void method2() throws ParseException {
        String s = "2024-04-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
