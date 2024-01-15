package com.designpattern.multithread.chapter11;

import com.designpattern.multithread.chapter11.ex02.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Chapter11 {
    private static final int TASKS = 10;

    public static void main(String[] args) {
//        System.out.println("BEGIN");
//        for (int i = 0 ; i < 10; i++) {
//            Log.println("main: i = " + i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ignored) {
//            }
//        }
//        Log.close();
//        System.out.println("END");

//        new ClientThread("Alice").start();
//        new ClientThread("Bobby").start();
//        new ClientThread("Chris").start();

//        ExecutorService service = Executors.newFixedThreadPool(3);
//
//        try {
//            for (int t = 0; t < TASKS; t++) {
//                Runnable printTask = () -> {
//                    Log.println("Hello!");
//                    Log.close();
//                    Log.remove();
//                };
//                service.execute(printTask);
//            }
//        } finally {
//            service.shutdown();
//        }

        ThreadLocal<Integer> threadLocal = new InheritableThreadLocal<Integer>(); // 여기만 변경됨.

        threadLocal.set(1);

        System.out.println("[main thread] value: " + threadLocal.get()); // 1

        new Thread(() -> System.out.println("B: " + threadLocal.get())).start();
    }
}
