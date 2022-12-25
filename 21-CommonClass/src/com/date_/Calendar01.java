package com.date_;

import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("年：" + c.get(Calendar.YEAR));
        System.out.println("月：" + c.get(Calendar.MONTH) + 1);
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("12小时制：" + c.get(Calendar.HOUR));
        System.out.println("24小时制：" + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));
    }
}
