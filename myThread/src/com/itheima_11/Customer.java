package com.itheima_11;

public class Customer implements Runnable {
    private Box box;

    public Customer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            try {
                box.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
