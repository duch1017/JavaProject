package com.itheima_04;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("王麻子", 18);
        Student s4 = new Student("王麻子", 18);
        hm.put(s1, "西安");
        hm.put(s2, "北京");
        hm.put(s3, "重庆");
        hm.put(s4, "成都");

        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "-->" + key.getAge() + "-->" + value);
        }
    }
}
