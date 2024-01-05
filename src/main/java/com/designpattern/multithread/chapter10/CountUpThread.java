package com.designpattern.multithread.chapter10;

public class CountUpThread extends Thread {

    private long counter = 0;

    private volatile boolean shutdownRequested = false;


    public void shutdownRequest() {
        interrupt();
    }

    public boolean isShutdownRequested() {
        return shutdownRequested;
    }

    @Override
    public final void run() {
        try {
            while (!isInterrupted()) {
                doWork();
            }
        } catch (InterruptedException ignored) {
        } finally {
            doShutdown();
        }
    }


    private void doWork() throws InterruptedException {
        counter++;
        System.out.println("doWork: counter = " + counter);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}

    }

    private void doShutdown() {
        System.out.println("doShutdown: counter = " + counter);
    }
}
