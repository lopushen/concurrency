package com.lopushen.threadlocal;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ievgenii on 6/5/2016.
 */
class SafeTask implements Runnable {
private static ThreadLocal<Date> dateThreadLocal = new ThreadLocal<Date>() {
    @Override
    protected Date initialValue() {
        return new Date();
    }
};
    @Override
    public void run() {
        System.out.printf("Starting Thread %s : %s\n", Thread.currentThread().getId(), dateThreadLocal.get());
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random()*10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Thread finished %s : %s\n", Thread.currentThread().getId(), dateThreadLocal.get());
    }
}
