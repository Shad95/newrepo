package com.test;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String corrPass = "abcd";
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the password");
        String guessPass;
        do {
            guessPass = sc.nextLine();
        } while (!guessPass.equals(corrPass));
        System.out.println("Password correct!");
    }
}
