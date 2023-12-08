package com.designpattern.multithread.chapter03;

import com.designpattern.multithread.chapter03.guard.ClientThread;
import com.designpattern.multithread.chapter03.guard.RequestQueue;
import com.designpattern.multithread.chapter03.guard.ServerThread;

public class Chapter03 {
    public static void main(String[] args) throws InterruptedException {
        RequestQueue requestQueue = new RequestQueue();
        Thread a = new ClientThread(requestQueue, "Alice", 341592L);
        new ServerThread(requestQueue, "Bobby", 653589L).start();

        a.sleep(1000);
    }
}
