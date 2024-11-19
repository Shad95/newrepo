package com.test;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game, you have " +
                "5 chances left");
        int chances = 5;
        Scanner sc = new Scanner(System.in);
        while(chances > 0) {
            int n = (int)(Math.random() * 100);
            System.out.println("make a guess");
            int num = sc.nextInt();
            if( num == n ) {
                System.out.println("Correct guess!, you won ");
                break;
            }
            System.out.println(n);
            chances--;

        }
        if(chances == 0) {
            System.out.println(" you have exhausted all your chances," +
                    "better luck next time!");
        }
    }
}
