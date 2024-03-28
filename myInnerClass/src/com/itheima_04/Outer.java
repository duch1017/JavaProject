package com.itheima_04;

public class Outer {
    public void methor() {

//        new Inner() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        }.show();

        Inner i = new Inner() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();

    }
}
