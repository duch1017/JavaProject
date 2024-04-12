package com.itheima_01;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File f1 = new File("D:/code/java/JavaProject/myFile/test/java.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());

        System.out.println("------------------------");

        File f2 = new File("D:/code/java/JavaProject/myFile/test");
        String[] list = f2.list();
        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        }

        System.out.println("-----------------------");

        File[] listFiles = f2.listFiles();
        if (listFiles != null) {
            for (File f : listFiles) {
//                System.out.println(f.getName());
                if (f.isFile()){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
