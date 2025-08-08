package com.dmdev.oop.lesson26.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) {
        var atomicInteger = new AtomicInteger();
        var value = atomicInteger.incrementAndGet();
        System.out.println(value); // 1

        var newValue = atomicInteger.addAndGet(20);
        System.out.println(newValue); // 21
    }
}
