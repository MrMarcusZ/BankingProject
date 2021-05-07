package com.bigbank.mypackage;

public class AccountHolder {

    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;





    //Constructors
    public AccountHolder(){

        this.checkingAccount = new CheckingAccount(0);
        this.savingsAccount = new SavingsAccount(0);

    }

    public AccountHolder(String firstName, String middleName, String lastName, String ssn,
                         double checkingAccountOpeningBalance, double savingAccountOpeningBalance) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
        this.savingsAccount = new SavingsAccount(savingAccountOpeningBalance);


    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
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

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setsSN(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() { return "Name: " + firstName + " " + middleName +
            " " + lastName + '\n' + "SSN: " + ssn + '\n' + "Checking Account Balance: " + checkingAccount.getBalance()
            + '\n' + "Checking Account Interest Rate: " + checkingAccount.getInterestRate() +
            '\n' + "Checking Account Balance in (3 years): " + checkingAccount.futureValue(3) + '\n' +
            "Savings Account Balance: " + savingsAccount.getBalance() + '\n' + "Savings Account Interest Rate: " +
            savingsAccount.getInterestRate() + '\n' + "Savings Account Balance in (3 years): " + savingsAccount.futureValue(3);
    }

}
