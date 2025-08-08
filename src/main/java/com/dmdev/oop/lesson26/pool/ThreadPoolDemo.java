package com.dmdev.oop.lesson26.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        var threadPool = Executors.newScheduledThreadPool(4);
        threadPool.scheduleAtFixedRate(() -> {
            System.out.println("OK!");
        }, 2L, 4L, TimeUnit.SECONDS);

//        threadPool.shutdown();
//        threadPool.awaitTermination(11, TimeUnit.HOURS);

    }

    private static void test() throws InterruptedException, ExecutionException {
        var threadPool = Executors.newFixedThreadPool(5);
        var future = threadPool.submit(() -> {
            Thread.sleep(2000);
            System.out.println("it's callable");
            return 1;
        });

        CompletableFuture.runAsync(() -> {});


        System.out.println("Result: " + future.get());
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
}
