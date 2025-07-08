package com.dmdev.oop.lesson24;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); // 2025-07-08T12:15:20.462353500+03:00[Europe/Moscow]

        System.out.println(now.toInstant().toEpochMilli()); // 1751966120462

        var plus = now.plus(1L, ChronoUnit.DAYS); // plus one day (universal method)
        System.out.println(plus);

        System.out.println(now.truncatedTo(ChronoUnit.DAYS)); // 2025-07-08T00:00+03:00[Europe/Moscow]

        var ldt = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(ldt); // 2025-07-08T09:22:11.489773700

        var now1 = LocalTime.now();
        System.out.println(now1); // 12:23:29.804111200
    }
}
