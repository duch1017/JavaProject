package com.itheima_09;

import java.util.*;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
         线程安全的类：
             StringBuffer
             Vector
             Hashtable
         */
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        Vector<String> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();

        Hashtable<String, String> hashtable = new Hashtable<>();
        HashMap<String, String> hashMap = new HashMap<>();

        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
    }
}
