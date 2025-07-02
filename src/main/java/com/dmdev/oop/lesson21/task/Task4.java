package com.dmdev.oop.lesson21.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        var integers = List.of(5, 2, 4, 2, 1);
        var result = integers.stream()
                .map(String::valueOf)
//                .collect(Collectors.joining());
//                .collect(Collectors.joining(","));
                .collect(Collectors.joining(",", "Prefix: ", " Suffix"));
        System.out.println(result);
    }
}
