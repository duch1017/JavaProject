package com.itheima_03;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOpertor jo = new JumppingOpertor();
        Jumpping j = new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
