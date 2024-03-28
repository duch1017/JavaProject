package com.itheima_04;

public class IntegerDemo {
    public static void main(String[] args) {
        // 装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);
        Integer i1 = 100;// 自动装箱
        // 拆箱：把包装类类型转换为对应的就基本数据类型
//        i1 = i1.intValue() + 200;
        i1 += 200;// 自动拆箱
        System.out.println(i1);

        Integer i2 = null;
        if (i2 != null) {
            i2 += 300;
        }
        System.out.println(i2);
    }
}
