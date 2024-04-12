package com.itheima_05;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

        Thread t1 = new Thread(my, "A");
        Thread t2 = new Thread(my, "B");

        t1.start();
        t2.start();
    }
}
