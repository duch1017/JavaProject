package com.itheima_02;

public class InterfaceDome {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 10;
        System.out.println(i.num);
//        i.num2 = 10;
        System.out.println(i.num2);
        System.out.println(Inter.num);
    }
}
