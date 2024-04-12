package com.itheima_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student a = new Student("a", 3);
        Student b = new Student("b", 5);
        Student c = new Student("c", 4);
        Student d = new Student("d", 1);
        Student e = new Student("e", 1);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s1.getAge() - s2.getAge();
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
            }
        });
        for (Student s : list) {
            System.out.println(s.getName() + "-->" + s.getAge());
        }

    }
}
