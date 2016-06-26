package com.lopushen.exceptions;

/**
 * Created by Ievgenii on 6/5/2016.
 */
class Main {
    public static void main(String[] args) {

//        DefaultExceptionHandler defaultExceptionHandler = new DefaultExceptionHandler();

        Task task = new Task();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
//        Thread.setDefaultUncaughtExceptionHandler(defaultExceptionHandler);
        thread.start();
    }
}
