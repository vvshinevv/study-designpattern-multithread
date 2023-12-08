package com.designpattern.multithread.intro01.bank;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        KakaoBank kakaoBank = new KakaoBank(0);
        Interceptor interceptor = new Interceptor();

        Thread intercept = new Thread(() -> {
            try {
                interceptor.intercept();
            } catch (InterruptedException ignored) {
            }
        });

        Thread deposit = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                kakaoBank.deposit(1);
            }
        });

        Thread withdraw = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                kakaoBank.withdraw(1);
            }
        });

        deposit.start();
        withdraw.start();
        intercept.start();

        deposit.join();
        withdraw.join();
        intercept.join();

        System.out.println();
        System.out.println();
        System.out.println(kakaoBank.getMoney());
    }
}
