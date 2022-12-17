package com.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("年: " + ldt.getYear());
        System.out.println("月: " + ldt.getMonthValue());
        System.out.println("日: " + ldt.getDayOfMonth());
        System.out.println("时: " + ldt.getHour());
        System.out.println("分: " + ldt.getMinute());
        System.out.println("秒: " + ldt.getSecond());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");
        String date = dtf.format(ldt);
        System.out.println(date);


    }
}
