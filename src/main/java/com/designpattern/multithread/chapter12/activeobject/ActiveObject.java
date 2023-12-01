package com.designpattern.multithread.chapter12.activeobject;

public interface ActiveObject {
    Result<String> makeString(int count, char fillchar);

    void displayString(String string);
}
