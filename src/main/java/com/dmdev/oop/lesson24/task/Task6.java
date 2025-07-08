package com.dmdev.oop.lesson24.task;

import java.time.Duration;
import java.time.LocalDate;

public class Task6 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 08-07-2025
        LocalDate prev = LocalDate.of(2018, 7, 7);

        //LocalDateTime.of(now, LocalTime.MIDNIGHT);
        var localDateTimeNow = now.atStartOfDay();
        var localDateTimePrev = prev.atStartOfDay();

        var duration = Duration.between(localDateTimePrev, localDateTimeNow);
        System.out.println(duration.getSeconds()); // 221011200
    }
}
