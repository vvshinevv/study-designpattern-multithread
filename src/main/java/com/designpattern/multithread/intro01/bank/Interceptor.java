package com.designpattern.multithread.intro01.bank;

public class Interceptor {
    private final Integer lock = 1;

    public void intercept() throws InterruptedException {
        synchronized (lock) {
            for (int i = 0; i < 100; i++) {
                System.out.print(i + "초 ");
            }
        }
    }
}
