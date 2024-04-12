package com.itheima_01;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("D:/code/java/JavaProject/myFile/test/java.txt");
//        File f2 = new File("myFile/java.txt");
//        System.out.println(f2.createNewFile());

//        System.out.println(f2.delete());

        File file = new File("myFile/a");
//        System.out.println(file.mkdir());
//        System.out.println(file.delete());

        File file1 = new File("myFile/a/a.txt");
//        System.out.println(file1.createNewFile());

        System.out.println(file1.delete());
        System.out.println(file.delete());
    }
}
