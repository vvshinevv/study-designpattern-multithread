package com.designpattern.multithread.appendix.chapterA;

public class Runner extends Thread {
    private boolean quit = false;

    @Override
    public void run() {
        while (!quit) {
            System.out.println("inner");
        }

        System.out.println("done");
    }

    public void shutDown() {
        quit = true;
    }
}
