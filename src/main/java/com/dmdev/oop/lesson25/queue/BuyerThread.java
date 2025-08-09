package com.dmdev.oop.lesson25.queue;

import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        Cashbox cashbox = null;
        try {
            cashbox = cashboxes.take();
            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + "  освобождаю кассу " + cashbox);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (cashbox != null) {
                cashboxes.add(cashbox);
            }
        }
    }
}
