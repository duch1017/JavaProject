package com.itheima_02;

public class MyThreadDemo {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
//        t1.setName("AAA");
//        t2.setName("BBB");

        t1.start();
        t2.start();
    }
}

