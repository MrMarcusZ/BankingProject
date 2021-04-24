package com.bigbank.mypackage;

public class BankingApp {

    public static void main(String[] args){


        CheckingAccount ch1 = new CheckingAccount(100.00);




        System.out.println(ch1);
        System.out.println("===========================");

        ch1.deposit(200.00);
        System.out.println(ch1);

        System.out.println("===========================");

        ch1.withdraw(400.00);
        System.out.println(ch1);






    }


}
