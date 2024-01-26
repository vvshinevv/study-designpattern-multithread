package com.designpattern.multithread.appendix.chapterA;

public class ChapterA {
    public static void main(String[] args) throws InterruptedException {
//        final Something obj = new Something();
//
//        new Thread(obj::write).start();
//        new Thread(obj::read).start();

//        for (int i = 0 ; i  < 100 ; i ++) {
//            Runner runner = new Runner();
//            runner.start();
//            runner.shutDown();
//        }


        final Person[] person = new Person[1];
        new Thread(() -> {
            try {
                person[0] = new Person("aa");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            System.out.println(person[0].getName());
        }).start();
    }
}
