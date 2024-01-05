package com.designpattern.multithread.chapter10.test;

public class Test1Thread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(50000);
            }
        } catch (InterruptedException ignored) {
            System.out.println(this.isInterrupted());
            Thread.currentThread().interrupt();
            System.out.println(this.isInterrupted());
        }
    }


}
