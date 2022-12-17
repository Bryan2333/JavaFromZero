package com.io;

/**
 * 处理流（包装流）
 */

public class BufferedReader_ extends Reader_ {
    private Reader_ reader_; //Reader_类型的属性

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFile() {
        reader_.readFile();
    }

    //多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    //多次读取字符串
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
