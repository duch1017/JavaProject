package com.itheima_01;

public class ObjectDemo {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18);
        System.out.println(stu);//com.itheima.Student@4554617c
        System.out.println(stu.toString());
        /*
        public void println(Object x) {
            String s = String.valueOf(x);
                synchronized (this) {
                    print(s);
                    newLine();
                }
        }

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

    }
}
