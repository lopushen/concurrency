package com.lopushen.threadgroupexceptions;

/**
 * Created by Ievgenii on 6/20/2016.
 */
public class Main {
    public static void main(String[] args) {
        ThreadGroup myThreadGroup= new MyThreadGroup("MyThreadGroup");
        Task task = new Task();
        for (int i = 0; i<100; i++) {
            Thread thread = new Thread(myThreadGroup, task);
            thread.start();
        }

    }
}
