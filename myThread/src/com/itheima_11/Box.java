package com.itheima_11;

public class Box {
    private int milk;
    private boolean state = false;

    public synchronized void put(int milk) throws InterruptedException {
        if (state) {
            wait();
        }
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        state = true;
        notify();
    }

    public synchronized void get() throws InterruptedException {
        if (!state) {
            wait();
        }
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        state = false;
        notify();
    }
}
