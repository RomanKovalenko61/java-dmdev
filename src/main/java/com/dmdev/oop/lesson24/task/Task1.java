package com.dmdev.oop.lesson24.task;

import java.time.LocalDateTime;

public class Task1 {

    public static void main(String[] args) {
        var localDateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
        var newLocalDateTime = localDateTime.plusMonths(3L);

        System.out.println(newLocalDateTime.toLocalDate());
        System.out.println(newLocalDateTime.toLocalTime());
    }
}
