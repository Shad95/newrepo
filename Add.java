package com.example.geometry;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        try {
            int divide = a/b;
            System.out.printf(" the result of divison is %s",divide);
        }
        catch(ArithmeticException e) {
            System.out.printf("invalid values entered,%s",e.getMessage());
        }
        System.out.println("\nafter exception");
    }
}
