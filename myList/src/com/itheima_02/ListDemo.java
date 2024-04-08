package com.itheima_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("王五", 18);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student stu = it.next();
            System.out.println(stu.getName() + ":" + stu.getAge());
        }

        System.out.println("--------");

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ":" + stu.getAge());
        }
    }
}
