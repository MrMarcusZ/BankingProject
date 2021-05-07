package com.bigbank.mypackage;

public class CDOffering {

    private int term;
    private double interestRate;


    public CDOffering(int term, double interestRate){

        this.interestRate = interestRate;
        this.term = term;

    }

    public int getTerm() {
        return term;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
