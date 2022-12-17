package com.exercise;

import java.util.ArrayList;

public class Exercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧");
        News news2 = new News("男子突然想起两个月前钓的鱼还在往兜里，捞起一看赶紧放生");

        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }

        for (int i = size - 1; i >= 0; i--) {
            News news = (News)(arrayList.get(i));
            System.out.println(processTitle(news.getTitle()));
        }

    }

    public static String processTitle(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() > 15) {
            return str.substring(0, 15) + "..."; //[0,14]
        } else {
            return str;
        }
    }
}

class News {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "新闻标题：" + title;
    }

    public News(String title) {
        this.title = title;
    }
}