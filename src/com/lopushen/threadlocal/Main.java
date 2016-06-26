package com.lopushen.threadlocal;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ievgenii on 6/5/2016.
 */
 class Main {
    public static void main(String[] args) {
        SafeTask unsafeTask = new SafeTask();
        for (int i = 0 ;i < 10; i++) {
            Thread thread  = new Thread(unsafeTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
