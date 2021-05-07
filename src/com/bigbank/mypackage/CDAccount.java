package com.bigbank.mypackage;

import java.util.Date;

public class CDAccount {
    private CDOffering offering;
    private double balance;
    private double interestRate;
    private int term;

    public CDAccount(CDOffering offering, double balance){
        this.offering = new CDOffering(0,0);
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }
}
