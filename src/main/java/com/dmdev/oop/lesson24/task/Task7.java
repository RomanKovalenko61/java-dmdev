package com.dmdev.oop.lesson24.task;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task7 {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant); // 2025-07-08T10:08:12.987794900Z Greenwich Time

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
//        ZonedDateTime.ofInstant(instant, ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime); // 2025-07-08T13:11:33.303357900+03:00[Africa/Cairo]
    }
}
