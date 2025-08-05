package com.dmdev.oop.lesson25.counter;

public class Counter {

    private static String description;
    private int count;

    public static void init() {
        //Class<Counter> counterClass = Counter.class;
        synchronized (Counter.class) {
            if (description == null) {
                description = "Test description";
            }
        }
    }

    public void increment() {
        //this.getClass();
        synchronized (this) {
            count++;
        }
    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
