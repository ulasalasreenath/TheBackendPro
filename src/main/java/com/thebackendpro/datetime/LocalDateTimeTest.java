package com.thebackendpro.datetime;

import java.time.*;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println(instant.atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println(instant.atZone(ZoneId.systemDefault()).toLocalTime());

        System.out.println(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
        System.out.println(LocalDate.ofInstant(instant, ZoneId.systemDefault()));
        System.out.println(LocalTime.ofInstant(instant, ZoneId.systemDefault()));
    }
}
