package com.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = sdf.format(date); //将日期格式化
        System.out.println(format); //输出2022年08月08日 12:58:12 周一

        String test = "2022年8月8日 12:53:23 周一";
        Date dateTest = (sdf.parse(test));
        System.out.println(dateTest);
    }
}
