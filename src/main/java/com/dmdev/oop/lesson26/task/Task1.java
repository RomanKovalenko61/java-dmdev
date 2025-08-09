package com.dmdev.oop.lesson26.task;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        var threadExecutor = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        var scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }
            threadExecutor.submit(() -> {
                Integer count = threadLocal.get();
                threadLocal.set(count == null ? 1 : ++count);
                System.out.printf("Поток `%s` задач `%d`%n", Thread.currentThread().getName(), threadLocal.get());
                Thread.sleep(seconds * 1000L);
                System.out.printf("Поток `%s` спал `%d секунд`%n", Thread.currentThread().getName(), seconds);
                return seconds;
            });
        }

        threadExecutor.shutdown();
        threadExecutor.awaitTermination(10L, TimeUnit.MINUTES);
    }
}
