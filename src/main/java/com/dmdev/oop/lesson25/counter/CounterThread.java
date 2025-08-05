package com.dmdev.oop.lesson25.counter;

public class CounterThread extends Thread {

    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3000; i++) {
            counter.increment();
        }
    }
}
