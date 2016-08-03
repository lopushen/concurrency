package com.lopushen.synchronization;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class Bank implements Runnable {

    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i< 100; i ++) {
            account.substractAmount(1000);
        }
    }
}
