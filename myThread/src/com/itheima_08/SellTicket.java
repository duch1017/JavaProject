package com.itheima_08;

public class SellTicket implements Runnable {
    //    private int tickets = 100;
    private static int tickets = 100;
    private final String lock = "锁";

    private int num = 0;

    @Override
    public void run() {
        while (true) {
            if (num % 2 == 0) {
//                synchronized (lock) {
                synchronized (this) {
//                synchronized (SellTicket.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(50);
                            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                            tickets--;
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            } else {
                /*synchronized (lock) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                            tickets--;
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }*/
                sellTicket();
            }
        }
    }

    /* private void sellTicket() {
         synchronized (lock) {
             if (tickets > 0) {
                 try {
                     Thread.sleep(100);
                     System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                     tickets--;
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
     }*/
    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
