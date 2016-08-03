package com.lopushen.addtitonalobjects;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cinema cinema = new Cinema();
        TicketOffice1 ticketOffice1 = new TicketOffice1(cinema);
        TicketOffice2 ticketOffice2 = new TicketOffice2(cinema);

        Thread thread1 = new Thread(ticketOffice1);
        Thread thread2 = new Thread(ticketOffice2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(cinema.getVacanciesCinema1());
        System.out.println(cinema.getVacanciesCinema2());
    }
}
