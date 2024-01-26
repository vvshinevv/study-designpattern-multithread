package com.designpattern.multithread.appendix.chapterA;

public class Something {
    private int x = 0;
    private int y = 0;

    public void write() {
        x = 100;
        y = 50;
    }

    public void read() {
        if (x < y) {
            System.out.println("x < y");
        }
    }
}
