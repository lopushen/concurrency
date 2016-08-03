package com.lopushen.synchronization;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void addAmount(double amount) {
        double tmp = balance;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tmp+=amount;
        balance = tmp;
    }
    public synchronized void substractAmount(double amount) {
        double tmp = balance;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tmp-=amount;
        balance = tmp;
    }
}
