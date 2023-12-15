package com.designpattern.multithread.chapter05.producer;

import com.designpattern.multithread.chapter05.Table;

import java.util.Random;

public class MakerThead extends Thread {
    private final Random random;
    private final Table table;
    private static int id = 0;

    public MakerThead(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[ Cake No. " + nextId() + " by " + getName() + "]";
                table.put(cake);
            }
        } catch (InterruptedException ignore) {
        }

    }

    private static synchronized int nextId() {
        return id++;
    }
}
