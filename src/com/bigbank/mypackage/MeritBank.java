package com.bigbank.mypackage;

public class MeritBank {

    private static CDOffering[] cdOffering;
    private double interestRate;
    private int term;
    private AccountHolder accountHolder;



    static void addAccountHolder(AccountHolder accountHolder){

        new AccountHolder();


    }

    static AccountHolder[] getAccountHolders(){
        return new AccountHolder[0];
    }

    static CDOffering[] getCDOfferings(){
        return new CDOffering[0];
    }

    static CDOffering getBestCDOffering(double depositAmount){
        return null;
    }

    static CDOffering getSecondBestCDOffering(double depositAmount){
        return null;
    }

   static void clearCDOfferings(){

    }

    static long getNextAccountNumber(){
        return 0;
    }

    static double totalBalances(){
        return 0.00;
    }
/*
    static double futureValue(double presentValue, double interestRate, int term){

    }

 */
}
