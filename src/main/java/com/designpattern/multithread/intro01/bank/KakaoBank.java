package com.designpattern.multithread.intro01.bank;

public class KakaoBank {
    private int money;

    private final Integer lock = 1;

    public KakaoBank(int money) {
        this.money = money;
    }

    public void deposit(int m) {
        synchronized (lock) {
            System.out.print("저축! ");
            money += m;
        }
    }

    public void withdraw(int m) {
        synchronized (lock) {
            System.out.print("출금! ");
            money -= m;
        }
    }

    public int getMoney() {
        return money;
    }
}
