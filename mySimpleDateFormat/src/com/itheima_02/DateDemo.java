package com.itheima_02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);

        System.out.println("------------------");

        String s4 = "2020-02-02 22:22:22";
        String f = "yyyy-MM-dd HH:mm:ss";
        Date d1 = DateUtils.stringToDate(s4, f);
        System.out.println(d1);
    }
}
