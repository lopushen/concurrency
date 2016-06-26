package com.lopushen.threadgroupexceptions;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Ievgenii on 6/20/2016.
 */
public class MyThreadGroup extends ThreadGroup {

    static int counter;
    static ReentrantLock reentrantLock = new ReentrantLock(true);
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        incrementCounter();
        System.out.printf("The thread %s has thrown an exception, The count is %d \n", t.getId(), counter);


        e.printStackTrace(System.out);
        System.out.println("Terminating the rest of the threads");
        interrupt();
    }

    public void incrementCounter() {
        reentrantLock.lock();
        try {
            System.out.printf("Incrementing counter by Thread %s", Thread.currentThread().getId());
            counter++;
        } finally {
            reentrantLock.unlock();
        }
    }
}
