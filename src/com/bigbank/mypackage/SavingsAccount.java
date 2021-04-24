package com.bigbank.mypackage;

import java.lang.Math;

public class SavingsAccount {

    //Global variables
    private double Balance;
    private double InterestRate = 0.01;

    //Constructor
    public SavingsAccount(double openingBalance){
        this.Balance = openingBalance;
    }



    //Getters but no setters....don't fully understand why yet.
    public double getBalance() {
        return Balance;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    /*
    Some methods go here.
    as of now I just have DEPOSIT, WITHDRAW methods
     */






    public boolean withdraw(double amount){


        if( Balance >= amount )
            Balance -= amount;
        return true;



    }

    public boolean deposit(double amount){

        Balance += amount;
        return !(amount < 0);
    }

    public double futureValue(int years){
        double FV;
        double PV = Balance;


        FV = PV + Math.pow(InterestRate,years);
        return FV;
    }








    @Override
    public String toString() {
        return "Savings Account Balance: " +
                Balance + "/n" +
                "Savings Account Interest Rate: " +
                InterestRate + "/n";
    }
}
