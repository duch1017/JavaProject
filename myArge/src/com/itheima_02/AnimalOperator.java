package com.itheima_02;

public class AnimalOperator {
    public void useAnimal(Animal a) { //抽象类名做方法是需要该抽象类的子类
        a.eat();
    }

    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }
}
