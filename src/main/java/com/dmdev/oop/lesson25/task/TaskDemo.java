package com.dmdev.oop.lesson25.task;

import java.util.LinkedList;
import java.util.Queue;

public class TaskDemo {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();
        var producerThread = new Thread(new ProducerThread(queue));
        var consumerThread = new Thread(new ConsumerThread(queue));

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        producerThread.join();
    }
}
