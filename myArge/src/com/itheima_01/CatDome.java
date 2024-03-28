package com.itheima_01;

public class CatDome {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat cat = new Cat();
        co.useCat(cat);

        Cat cat1 = co.getCat();
        System.out.println(cat1);
        cat1.eat();
    }
}
