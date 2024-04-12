package com.itheima_07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num1 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
            }
        });
        Student s1 = new Student("a", 98, 100);
        Student s2 = new Student("b", 95, 95);
        Student s3 = new Student("v", 93, 100);
        Student s4 = new Student("d", 100, 97);
        Student s5 = new Student("e", 98, 98);

        Student s6 = new Student("f", 97, 99);
//        Student s7 = new Student("f", 98, 98);
        Student s7 = new Student("g", 98, 98);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        for (Student s : ts) {
            System.out.println(s.getName() + ":" + s.getChinese() + "," + s.getMath() + "," + s.getSum());
        }
    }
}
