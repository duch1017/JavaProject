package com.itheima_02;

public class AnimalDome {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);

        Animal a2 = ao.getAnimal();
        a2.eat();

    }
}
