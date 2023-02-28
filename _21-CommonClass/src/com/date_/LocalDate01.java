package com.date_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate01 {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        int today = dateNow.getDayOfMonth();

        LocalDate start = dateNow.minusDays(today - 1);

        System.out.println(start);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 E");
        String date = dtf.format(start);
        System.out.println(date);
    }
}
