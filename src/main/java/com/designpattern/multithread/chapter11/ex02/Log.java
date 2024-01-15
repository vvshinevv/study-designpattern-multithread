package com.designpattern.multithread.chapter11.ex02;

import java.time.LocalDateTime;

public class Log {
    private static final ThreadLocal<TSLog> tsLogCollection = new ThreadLocal<>();

    public static void println(String s) {
        getTSLog().println(s);
    }

    public static void close() {
        getTSLog().close();
    }

    public static void remove() {
        tsLogCollection.remove();
    }

    private static TSLog getTSLog() {
        TSLog tsLog = tsLogCollection.get();

        if (tsLog == null) {
            tsLog = new TSLog(Thread.currentThread().getName() + "-" + LocalDateTime.now() + "-log.txt");
            tsLogCollection.set(tsLog);
        }

        return tsLog;
    }
}
