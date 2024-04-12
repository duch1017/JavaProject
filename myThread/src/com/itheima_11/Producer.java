package com.itheima_11;

public class Producer implements Runnable {
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 1; i < 31; i++) {
            try {
                box.put(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
