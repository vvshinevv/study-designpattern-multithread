package com.designpattern.multithread.chapter10.test;

public class Chapter10Test {

    public static void main(String[] args) throws InterruptedException {

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("uncaughtException");
            }
        });


        Test1Thread test1Thread = new Test1Thread();
        test1Thread.start();

        Thread.sleep(400000);
        test1Thread.interrupt();
    }
}
