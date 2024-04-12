package com.itheima_04;

public class GenericDemo {
    public static void main(String[] args) {
        GenericImpl<String> g1 = new GenericImpl<>();
        g1.show("zhangsan");

        GenericImpl<Integer> g2 = new GenericImpl<>();
        g2.show(123);
    }
}
