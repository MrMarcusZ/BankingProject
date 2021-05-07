package com.bigbank.mypackage;

public class BankAccount {

    private double balance;
    private double interestRate;
    private long accountNumber;



    public BankAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;

    }

    public BankAccount(long accountNumber, double balance, double interestRate){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;

    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

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
}
