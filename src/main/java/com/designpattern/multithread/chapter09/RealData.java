package com.designpattern.multithread.chapter09;

public class RealData implements Data {

    private final String content;

    public RealData(int count, char c) {
        System.out.println("making RealData (" + count + ", " + c + ") BEGIN");
        char[] buffer = new char[count];
        for (int i = 0; i < count; i++) {
            buffer[i] = c;
            try {
                Thread.sleep(100L);
            } catch (InterruptedException ignored) {
            }
        }

        System.out.println("making RealData (" + count + ", " + c + ") END");
        this.content = new String(buffer);
    }

    @Override
    public String getContent() {
        return content;
    }
}
