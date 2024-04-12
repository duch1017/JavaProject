package com.itheima_01;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/code/java/JavaProject/myFile/test/java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("D:/code/java/JavaProject/myFile/test/javaSE");
        System.out.println(f2.mkdir());

        File f3 = new File("D:/code/java/JavaProject/myFile/test/a/aa/aaa/aaaa");
        System.out.println(f3.mkdirs());
    }
}
