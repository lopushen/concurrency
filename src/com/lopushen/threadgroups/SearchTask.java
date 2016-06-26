package com.lopushen.threadgroups;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ievgenii on 6/19/2016.
 */
public class SearchTask implements Runnable {
    private Result result;

    public SearchTask(Result result) {
        this.result = result;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("Thread %s : Start\n", name);
        try {

            doTask();
            result.setValue(name);
        } catch (InterruptedException e) {
            System.out.printf("Thread %s interrupted \n", name);
            e.printStackTrace();
        }
    }

    private void doTask() throws InterruptedException {
        int value = (int) (new Random(new Date().getTime()).nextDouble()*100);
        System.out.printf("Thread %s %d \n", Thread.currentThread().getName(), value);
        TimeUnit.SECONDS.sleep(value);
    }
}
