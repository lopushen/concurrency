package com.lopushen.deamon;

import java.util.Date;
import java.util.Deque;

/**
 * Created by Ievgenii on 6/5/2016.
 */
 class Cleaner extends Thread {
    private Deque<Event> deque;

    public Cleaner(Deque<Event> deque) {
        this.deque = deque;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            clean(new Date());
        }
    }

    private void clean(Date date) {
        long difference;
        boolean delete;

        if (deque.size() == 0) {
            return;
        }
        delete = false;
        do {
            Event event = deque.getLast();
            difference = date.getTime() - event.getDate().getTime();
            if (difference > 10000) {
                deque.removeLast();
                delete = true;
            }
        } while (difference > 10000);

        if (delete) {
            System.out.printf("Cleaner: Size of the queue: %d\n", deque.size());
        }
    }
}
