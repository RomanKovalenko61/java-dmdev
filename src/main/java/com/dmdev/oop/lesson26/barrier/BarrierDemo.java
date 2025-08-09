package com.dmdev.oop.lesson26.barrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length, () -> System.out.println("Пуск!!!"));

        var threadPool = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunnable(detail, cyclicBarrier))
                .forEach(threadPool::execute);

        threadPool.shutdown();
        threadPool.awaitTermination(10L, TimeUnit.SECONDS);
    }
}
