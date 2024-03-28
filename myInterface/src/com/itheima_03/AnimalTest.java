package com.itheima_03;

public class AnimalTest {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        System.out.println("----------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("----------");

        Cat cat = new Cat();
    }
}
