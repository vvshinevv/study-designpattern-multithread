package com.designpattern.multithread.chapter03.guard;

import java.util.Random;

public class ClientThread extends Thread {
    private final Random random;
    private final RequestQueue requestQueue;

    public ClientThread(RequestQueue requestQueue, String name, long seed) {
        super(name);
        this.random = new Random(seed);
        this.requestQueue = requestQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Request request = new Request("No. " + i);
            System.out.println(Thread.currentThread().getName() + " requests " + request);
            notifyAll();
            requestQueue.putRequest(request);

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
