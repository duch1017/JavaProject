package com.itheima_04;

public class PlayerDome {
    public static void main(String[] args) {
        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("张三");
        ppc.setAge(22);
        System.out.println(ppc.getName() + "===" + ppc.getAge());
        ppc.teach();
        ppc.eat();
        ppc.speak();
        System.out.println("------------------");

        BasketballCoach bc = new BasketballCoach("李四", 23);
        System.out.println(bc.getName() + "===" + bc.getAge());
        bc.teach();
        bc.eat();
    }
}
