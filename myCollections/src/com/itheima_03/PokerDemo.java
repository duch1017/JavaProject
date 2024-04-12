package com.itheima_03;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        String[] colors = {"♣", "♥", "♠", "♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                String s = color + number;
                array.add(s);
            }
        }
        array.add("小王");
        array.add("大王");
        Collections.shuffle(array);
//        System.out.println(array);
        ArrayList<String> aArray = new ArrayList<>();
        ArrayList<String> bArray = new ArrayList<>();
        ArrayList<String> cArray = new ArrayList<>();
        ArrayList<String> dArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dArray.add(poker);
            } else if (i % 3 == 0) {
                aArray.add(poker);
            } else if (i % 3 == 1) {
                bArray.add(poker);
            } else if (i % 3 == 2) {
                cArray.add(poker);
            }
        }
        lookPoker("A", aArray);
        lookPoker("B", bArray);
        lookPoker("C", cArray);
        lookPoker("底牌", dArray);
    }

    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
