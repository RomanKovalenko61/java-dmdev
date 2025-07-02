package com.dmdev.oop.lesson21.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );
        var result = strings.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        var result2 = strings.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(result2);
    }
}
