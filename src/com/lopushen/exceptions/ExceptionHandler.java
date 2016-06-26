package com.lopushen.exceptions;

/**
 * Created by Ievgenii on 6/5/2016.
 */
class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("An Exception has been captured\n");
        System.out.printf("Thread id is %d", t.getId());
        System.out.printf("Exception: %s, %s, \n", e.getClass(), e.getMessage());
        System.out.println("Stack trace:");
        e.printStackTrace(System.out);
        System.out.printf("Thread status: %s", t.getState());
    }
}
