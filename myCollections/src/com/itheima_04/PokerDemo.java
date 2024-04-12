package com.itheima_04;

import java.util.*;

public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        String[] colors = {"♣", "♥", "♠", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                String poker = color + number;
                hashMap.put(index, poker);
                array.add(index);
                index++;
            }
        }
        hashMap.put(index, "小王");
        array.add(index);
        index++;
        hashMap.put(index, "大王");
        array.add(index);

        Collections.shuffle(array);
        TreeSet<Integer> aSet = new TreeSet<>();
        TreeSet<Integer> bSet = new TreeSet<>();
        TreeSet<Integer> cSet = new TreeSet<>();
        TreeSet<Integer> dSet = new TreeSet<>();

        for (int i = 0; i < array.size(); i++) {
            Integer j = array.get(i);
            if (i >= array.size() - 3) {
                dSet.add(j);
            } else if (i % 3 == 0) {
                aSet.add(j);
            } else if (i % 3 == 1) {
                bSet.add(j);
            } else if (i % 3 == 2) {
                cSet.add(j);
            }
        }
        lookPoker("A", aSet, hashMap);
        lookPoker("B", bSet, hashMap);
        lookPoker("C", cSet, hashMap);
        lookPoker("底牌", dSet, hashMap);
    }

    public static void lookPoker(String name, TreeSet<Integer> treeSet, HashMap<Integer, String> hashMap) {
        System.out.print(name + "的牌是：");
        for (Integer key : treeSet) {
            String poker = hashMap.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
