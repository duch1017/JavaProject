package com.itheima_05;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println(this.name.compareTo(o.name));
//        return 0;
//        return 1;//升序
//        return -1;//降序
        return this.age - o.age == 0 ? this.name.compareTo(o.name) : this.age - o.age;
    }
}
