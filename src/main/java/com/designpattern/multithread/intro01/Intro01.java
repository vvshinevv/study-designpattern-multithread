package com.designpattern.multithread.intro01;

public class Intro01 {
    public static void main(String[] args) {
        PrintThread printThread1 = new PrintThread("Good!");
        PrintThread printThread2 = new PrintThread("Night!");
        printThread1.start();
        printThread2.start();
    }
}
