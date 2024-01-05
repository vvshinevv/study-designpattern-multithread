package com.designpattern.multithread.chapter10;

public class Chapter10 {
    public static void main(String[] args) {
        System.out.println("main: BEGIN");
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("uncaughtException");
            }
        });

        try {
            CountUpThread t = new CountUpThread();

            t.start();
            Thread.sleep(10000);

            System.out.println("main: shutdownRequest");
            t.shutdownRequest();

            System.out.println("main: join");
            t.join();
        } catch (InterruptedException ignored) {
        }

        System.out.println("main: END");
    }
}
