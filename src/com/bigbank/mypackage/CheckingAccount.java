package com.bigbank.mypackage;

import java.lang.Math;

public class CheckingAccount {

    //Global variables
    private double Balance;
    private final double InterestRate = 0.001;
    private double FutureValue;

    //Constructor
    public CheckingAccount(double openingBalance){

        Balance = openingBalance;
    }

    //Getters...just getters
    public double getBalance() {


        return Balance;
    }

    public double getInterestRate() {
        return InterestRate;
    }


    /*
    methods here, only two as of now
    DEPOSIT
    WITHDRAW
     */
    public boolean withdraw(double amount){

        if( Balance >= amount )
         Balance -= amount;
        return true;



   }

   public boolean deposit(double amount) {
       Balance += amount;
       return !(amount < 0);

   }

    public double futureValue(int years){
        double FV;
        double PV = Balance;


        FV = PV + Math.pow((1)+InterestRate,years);

        return FV;

    }

    @Override
    public String toString() {
        return "Checking Account Balance: " +
                Balance + "\n" +
                "Checking Account Interest Rate: " +
                InterestRate + "\n" + "Checking Account Balance after 3 years: " + futureValue(3);
    }






}
