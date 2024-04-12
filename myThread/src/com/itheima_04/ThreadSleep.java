package com.itheima_04;

public class ThreadSleep extends Thread {
    public ThreadSleep() {
    }

    public ThreadSleep(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " --> " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
