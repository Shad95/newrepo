package com.test;

import java.util.Scanner;

public class FibUsingRecursion {
    public static void main(String[] args) {
        System.out.println(" enter the number of terms of fibonacci " +
                "you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = printFib(5);
    }

    public static int printFib( int num){
        System.out.print("0 1 ");

            if (num > 3) {
                int a = 0, b = 1;
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
           }
            int result = printFib(num - 1);
        if ( num < 3) {
            return result;
        }
        return result;
    }
}
