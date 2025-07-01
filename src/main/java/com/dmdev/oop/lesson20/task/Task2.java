package com.dmdev.oop.lesson20.task;

import java.util.HashSet;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUniques(integers));
    }

    private static int countUniques(List<Integer> list) {
        return new HashSet<>(list).size();
    }
}
