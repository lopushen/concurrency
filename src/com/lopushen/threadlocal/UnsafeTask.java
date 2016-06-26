package com.lopushen.threadlocal;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ievgenii on 6/5/2016.
 */
 class UnsafeTask implements Runnable {
    private static Date startDate;



    @Override
    public void run() {
        startDate =  new Date();
        System.out.printf("Starting Thread %s : %s\n", Thread.currentThread().getId(), startDate);
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random()*10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Thread finished %s : %s\n", Thread.currentThread().getId(), startDate);
    }
}
