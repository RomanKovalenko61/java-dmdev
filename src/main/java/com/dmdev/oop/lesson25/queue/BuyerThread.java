package com.dmdev.oop.lesson25.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!cashboxes.isEmpty()) {
                    // Maybe NoSuchElementException !!! two thread and one cashbox
                    Cashbox cashbox = cashboxes.remove();

                    System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);

                    Thread.sleep(5L);

                    System.out.println(Thread.currentThread().getName() + "  освобождаю кассу " + cashbox);
                    cashboxes.add(cashbox);
                    break;
                } else {
                    Thread.sleep(5L);
                    System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
