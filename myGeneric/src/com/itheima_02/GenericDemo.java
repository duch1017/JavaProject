package com.itheima_02;

public class GenericDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三");
        System.out.println(s1.getName());

        Teacher t1 = new Teacher(30);
        System.out.println(t1.getAge());

        System.out.println("-------------");

        Generic<String> g1 = new Generic<>();
        g1.setT("张三");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Student> g3 = new Generic<>();
        g3.setT(s1);
        Student s2 = g3.getT();
        System.out.println(s2.getName());
    }
}
