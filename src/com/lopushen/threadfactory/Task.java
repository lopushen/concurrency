package com.lopushen.threadfactory;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class Task implements Runnable {

    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {

            TimeUnit.SECONDS.sleep(1);
            int number = barrier.await();
            System.out.println("Executed the task " + number);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
