package com.lopushen.addtitonalobjects;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class TicketOffice2 implements Runnable {
    private Cinema cinema;

    public TicketOffice2(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void run() {
        cinema.sellTickets1(4);
        cinema.sellTickets2(5);
        cinema.returnTickets1(7);
        cinema.sellTickets1(8);
        cinema.returnTickets2(9);
        cinema.sellTickets1(3);
        cinema.sellTickets2(4);
        cinema.returnTickets2(3);
    }
}
