package com.dmdev.oop.lesson21.task;

import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        var map = Map.of(
                "string1", 1,
                "strin2", 2,
                "string3", 3,
                "string4", 5,
                "strin5", 5
        );

        var sum = map.entrySet().stream()
                .filter(e -> e.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
