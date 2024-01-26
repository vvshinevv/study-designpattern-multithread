package com.designpattern.multithread.appendix.chapterA;

import static java.lang.Thread.sleep;

public class Person {
    private final String name;

    public Person(String name) throws InterruptedException {
        sleep(1000L);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
