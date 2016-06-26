package com.lopushen.deamon;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Ievgenii on 6/5/2016.
 */
 class Main {
    public static void main(String[] args) {
        Deque<Event> events = new ArrayDeque<Event>();

        WriterTask writerTask = new WriterTask(events);
        for (int i = 0; i< 3; i++) {
            Thread thread = new Thread(writerTask);
            thread.start();

        }

        Cleaner cleaner = new Cleaner(events);
        cleaner.start();

    }
}
