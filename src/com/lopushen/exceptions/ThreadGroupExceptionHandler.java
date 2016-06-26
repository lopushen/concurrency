package com.lopushen.exceptions;

/**
 * Created by Ievgenii on 6/5/2016.
 */
 class ThreadGroupExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("This is thread group exception handler");
    }
}
