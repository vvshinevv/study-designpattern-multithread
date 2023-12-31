package com.designpattern.multithread.chapter09;

public class Host {
    public Data request(final int count, final char c) {
        System.out.println("request (" + count + ", " + c + ") BEGIN");

        final FutureData future = new FutureData();
        new Thread(() -> {
            RealData realData = new RealData(count, c);
            future.setRealData(realData);
        }).start();

        System.out.println("request (" + count + ", " + c + ") END");

        return future;
    }
}
