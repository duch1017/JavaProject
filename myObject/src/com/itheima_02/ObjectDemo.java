package com.itheima_02;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);

//        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        /*
        public boolean equals(Object obj) {
            this --- s1
            obj  --- s2
            return (this == obj);
        }
        */
    }
}
