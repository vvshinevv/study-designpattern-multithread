package com.designpattern.multithread.chapter06;

public class Chapter06 {
    public static void main(String[] args) {
        Data data = new Data(10);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new WriterThread(data, "ABC").start();
        new WriterThread(data, "abc").start();
    }
}
