package com.itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("王麻子", 18);
        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student stu = hm.get(key);
            System.out.println(stu.getName() + "-->" + stu.getAge());
        }
        System.out.println("----------------");

        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "-->" + value.getName() + "-->" + value.getAge());
        }
    }
}
