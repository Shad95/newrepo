package com.example.utils;

public class BankAccount {
    private String accHolderName;
    private int accNumber;
    float accBalance;
    private int depositAmount;
    private int withdrawAmount;


    public BankAccount(String accHolderName , int accNumber ,
                       float accBalance) {
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    public String deposit(int depositAmount, int accNumber) {
        if( this.accNumber != accNumber){
            System.out.println("wrong account selected");
            return "deposit unsuccessfull";
        }
        accBalance = accBalance + depositAmount;
        return "money deposited successfully";
    }
    public String withdraw(int withdrawAmount, int accNumber) {
        if( this.accNumber != accNumber){
            System.out.println("wrong account info given" +
                    ", please give correct account number");
            return "deposit unsuccessfull";
        }
        if( accBalance == 0 || accBalance < withdrawAmount)  {
            return " you don't have enough balance in your account";
        }
        accBalance = accBalance - depositAmount;
        return "money withdrawn successfully";
    }

    public float getAccountBalance(int accNumber) {
        if( this.accNumber != accNumber) {
            System.out.println("wrong account info given" +
                    ", please give correct account number");
            return 0;
        }
        return accBalance;
    }
}
