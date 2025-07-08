package com.dmdev.oop.lesson24.task;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 08-07-2025
        LocalDate prev = LocalDate.of(2018, 7, 7);

        Period period = Period.between(prev, now);
        System.out.println(period.getYears()); // 7
        System.out.println(period.getMonths()); // 0
        System.out.println(period.getDays()); // 1

        var days = ChronoUnit.DAYS.between(prev, now);
        System.out.println(days); // 2558
    }
}
