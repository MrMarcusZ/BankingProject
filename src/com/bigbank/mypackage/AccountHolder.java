package com.bigbank.mypackage;

public class AccountHolder {

    private String firstName;
    private String middleName;
    private String lastName;
    private String sSN;
    private Double chkOpeningBalance;
    private Double savOpeningBalance;


    //Constructors
    public AccountHolder(){
        System.out.println("Default Constructor");
    }

    public AccountHolder(String firstName, String middleName, String lastName, String sSN,
                         Double chkOpeningBalance, Double savOpeningBalance) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sSN = sSN;
        this.chkOpeningBalance = chkOpeningBalance;
        this.savOpeningBalance = savOpeningBalance;
    }








    /*
    Getters and Setters
     */

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getsSN() {
        return sSN;
    }

    /*

    CheckingAccount getCheckingAccount(){




    }

    SavingsAccount getSavingsAccount(){

    }

    */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    @Override
    public String toString() { return "Name: " + firstName + " " + middleName +
            " " + lastName + '\n' + "SSN: " + sSN + '\n' + "Checking Account Balance: " + chkOpeningBalance + '\n' +
            "Savings Account Balance: " + savOpeningBalance;
    }
}
