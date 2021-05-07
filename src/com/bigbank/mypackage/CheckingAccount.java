package com.bigbank.mypackage;

import java.lang.Math;

public class CheckingAccount {

    //Global variables
    private double balance;
    private final double interestRate = 0.001;
    private double futureValue;

    //Constructor
    public CheckingAccount(double openingBalance){

        balance = openingBalance;
    }

    //Getters...just getters
    public double getBalance() {


        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }


    /*
    methods here, only two as of now
    DEPOSIT
    WITHDRAW
     */
    public boolean withdraw(double amount){

        if (balance >= amount) {
            balance -= amount;
        }
        return true;



   }

   public boolean deposit(double amount) {
       balance += amount;
       return !(amount < 0);

   }

    public double futureValue(int years){
        double FV;
        double PV = balance;


        FV = PV + Math.pow((1)+ interestRate,years);

        return FV;

    }

    @Override
    public String toString() {
        return "Checking Account Balance: " +
                balance + "\n" +
                "Checking Account Interest Rate: " +
                interestRate + "\n" + "Checking Account Balance after 3 years: " + futureValue(3);
    }






}
