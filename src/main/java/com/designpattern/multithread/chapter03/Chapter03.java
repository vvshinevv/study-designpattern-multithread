package com.designpattern.multithread.chapter03;

import com.designpattern.multithread.chapter03.guard.ClientThread;
import com.designpattern.multithread.chapter03.guard.RequestQueue;
import com.designpattern.multithread.chapter03.guard.ServerThread;

public class Chapter03 {
    public static void main(String[] args) throws InterruptedException {
        RequestQueue requestQueue = new RequestQueue();
        Thread client = new ClientThread(requestQueue, "Alice", 341592L);
        Thread server = new ServerThread(requestQueue, "Bobby", 653589L);

        client.start();
        server.start();
    }
}
