package com.lopushen.join;

import java.util.Date;

 class Main {

    public static void main(String[] args) {
	    Thread thread1 = new Thread(new DataSourceLoader());
	    Thread thread2 = new Thread(new NetworkConnectionsLoader());
//        thread2.setDaemon(true);
        thread1.start();
        thread2.start();

        try {

            thread1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Main: Configuration has been loaded: %s\n",new Date());
    }
}
