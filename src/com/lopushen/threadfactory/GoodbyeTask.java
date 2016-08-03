package com.lopushen.threadfactory;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class GoodbyeTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Saying goodbye!!!");
    }
}
