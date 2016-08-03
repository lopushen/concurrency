package com.lopushen.synchronization;

/**
 * Created by i.lopushen on 03/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Bank bank = new Bank(account);
        Company company = new Company(account);

        Thread bankThread = new Thread(bank);
        Thread companyThread = new Thread(company);
        bankThread.start();
        companyThread.start();

        try {
            companyThread.join();
            bankThread.join();
            System.out.println("The account balance "+account.getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
