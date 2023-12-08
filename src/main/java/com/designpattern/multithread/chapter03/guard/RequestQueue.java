package com.designpattern.multithread.chapter03.guard;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<>();

    public synchronized Request getRequest() {
        while (queue.peek() == null) {
            try {
                wait();
                System.out.println("aa");
            } catch (InterruptedException ignored) {
            }
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();
    }
}
