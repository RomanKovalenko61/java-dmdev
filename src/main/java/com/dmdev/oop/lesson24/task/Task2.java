package com.dmdev.oop.lesson24.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task2 {

    public static void main(String[] args) {
        var now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String format = now.format(formatter); // 08.07.2025 12:45:40
        System.out.println(format);
    }
}
