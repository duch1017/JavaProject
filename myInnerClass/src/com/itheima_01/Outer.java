package com.itheima_01;

public class Outer {
    private int num = 10;

    public class Inner {

        private void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner in = new Inner();
        in.show();
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();
    }
}
