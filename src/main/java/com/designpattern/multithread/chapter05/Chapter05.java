package com.designpattern.multithread.chapter05;

import com.designpattern.multithread.chapter05.consumer.EaterThread;
import com.designpattern.multithread.chapter05.producer.MakerThead;

import static java.lang.Thread.interrupted;

public class Chapter05 {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThead("MakerThread-1", table, 31415).start();
        new MakerThead("MakerThread-2", table, 91231).start();
        new MakerThead("MakerThread-3", table, 58712).start();
        new EaterThread("EaterThread-1", table, 31213).start();
        new EaterThread("EaterThread-2", table, 62312).start();
        Thread a = new EaterThread("EaterThread-3", table, 30912);
        interrupted();
    }
}
