package com.lopushen.threadfactory;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class Main {

    public static final int N = 10;

    public static void main(String[] args) throws InterruptedException {
        MyThreadFactory threadFactory = new MyThreadFactory("The factory");
        GoodbyeTask goodbyeTask = new GoodbyeTask();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N, goodbyeTask);
        Task task = new Task(cyclicBarrier);

        for (int i = 0; i < 10; i++) {
            Thread thread = threadFactory.newThread(task);
            thread.start();
        }


        System.out.println(threadFactory.getStats());
    }
}
