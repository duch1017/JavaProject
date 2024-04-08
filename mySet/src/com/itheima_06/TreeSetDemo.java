package com.itheima_06;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int i = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return i;
            }
        });
        Student s1 = new Student("b", 29);
        Student s2 = new Student("s", 28);
        Student s3 = new Student("a", 30);
        Student s4 = new Student("c", 33);
        Student s5 = new Student("d", 33);
        Student s6 = new Student("b", 33);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);


        for (Student s : ts) {
            System.out.println(s.getName() + ":" + s.getAge());
        }
    }
}
