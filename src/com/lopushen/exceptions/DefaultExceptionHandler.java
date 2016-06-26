package com.lopushen.exceptions;

/**
 * Created by Ievgenii on 6/5/2016.
 */
 class DefaultExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("this is the default exception handler");
    }
}
