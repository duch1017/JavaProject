package com.itheima_07;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private String lock = "锁";

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                    tickets--;
                }
            }
        }
    }
}
