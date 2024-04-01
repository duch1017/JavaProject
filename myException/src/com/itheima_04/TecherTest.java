package com.itheima_04;

import java.util.Scanner;

public class TecherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("分数：");
        int score = sc.nextInt();

        Techer t = new Techer();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            throw new RuntimeException(e);
        }
    }
}
