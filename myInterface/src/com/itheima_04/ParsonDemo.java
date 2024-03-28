package com.itheima_04;

public class ParsonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer("张三", 23);
        System.out.println(ppp.getName() + "===" + ppp.getAge());
        ppp.study();
        ppp.eat();
        ppp.speak();
        System.out.println("----------------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("李四");
        bp.setAge(23);
        System.out.println(bp.getName() + "===" + bp.getAge());
        bp.study();
        bp.eat();
    }
}
