package com.dmdev.oop.lesson21.task;

import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);
        integers.stream()
                .filter(i -> i % 2 != 0)
                .filter(i -> i % 5 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
