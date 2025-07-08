package com.dmdev.oop.lesson24.task;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task8 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 08-07-2025

        // interface TemporalAdjuster
        var localDateTime = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(localDateTime); // 2025-08-19T13:15:22.999757200
    }
}
