package com.itheima_02;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);// new ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("数组索引不存在");
//            System.out.println(e.getMessage());
            System.out.println(e.toString());// java.lang.ArrayIndexOutOfBoundsException: 3
//            e.printStackTrace();
        }
    }
}
