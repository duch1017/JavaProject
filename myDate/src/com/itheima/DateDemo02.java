package com.itheima;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println((int) (d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365) + "年");

        System.out.println(d);
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }
}
