package com.properties;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class Property_ {
    public static void main(String[] args){

    }

    @Test
    public void noProperties() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(".\\RelatedFile\\demo.properties"));
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[1]);
        }

        br.close();
    }

    @Test
    public void propertiesOut() throws IOException {
        Properties properties = new Properties();
        properties.put("1", "Google");
        properties.put("2", "Github");

        properties.put("3", "StackOverflow");
        properties.put("4", "三亩地");
        properties.store(new FileOutputStream(".\\RelatedFile\\demo2.properties"), null);

    }

    @Test
    public void propertiesIn() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader(".\\RelatedFile\\demo2.properties"));

        // 将 K-V 输出到显示器
        properties.list(System.out);

        System.out.println(properties.get("4"));
    }
}
