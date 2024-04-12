package com.itheima_03;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority("A");
        ThreadPriority tp2 = new ThreadPriority("B");
        ThreadPriority tp3 = new ThreadPriority("C");

        tp1.setPriority(3);
        tp2.setPriority(2);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();

//        System.out.println(tp1.getPriority());
//        System.out.println(tp2.getPriority());
//        System.out.println(tp3.getPriority());
    }
}
