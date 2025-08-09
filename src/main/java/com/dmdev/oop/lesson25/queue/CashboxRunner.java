package com.dmdev.oop.lesson25.queue;

import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class CashboxRunner {

    public static void main(String[] args) throws InterruptedException {
//        BlockingQueue<Cashbox> cashboxes = new ArrayBlockingQueue<>(2, true, List.of(new Cashbox(), new Cashbox()));
        var cashboxes = new Semaphore(2);

        var threads = Stream.of(
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes)
                ).map(Thread::new)
                .peek(Thread::start)
                .toList();

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
