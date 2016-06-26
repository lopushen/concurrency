package com.lopushen.join;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ievgenii on 6/5/2016.
 */
 class DataSourceLoader implements Runnable{
    @Override
    public void run() {
        System.out.printf("Beginning data sources loading: %s\n", new Date());
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Finished data sources loading: %s\n", new Date());
    }
}
