package com.itheima_04;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin("张三");
        ThreadJoin tj2 = new ThreadJoin("李四");
        ThreadJoin tj3 = new ThreadJoin("王麻子");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        tj2.start();
        tj3.start();
    }
}
