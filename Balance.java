package com.example.utils;

public class Balance {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Ram",
                123,100);
        System.out.println(b1.getAccountBalance(123));
        System.out.println(b1.withdraw(1000,123));
    }
}
