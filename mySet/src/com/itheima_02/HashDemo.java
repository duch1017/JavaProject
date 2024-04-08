package com.itheima_02;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("--------");
        Student s2 = new Student("张三", 18);
        System.out.println(s2.hashCode());
        System.out.println("hello:" + "hello".hashCode());
        System.out.println("world:" + "world".hashCode());
        System.out.println("world:" + "world".hashCode());
        System.out.println("重地:" + "重地".hashCode());
        System.out.println("通话:" + "通话".hashCode());

    }
}
