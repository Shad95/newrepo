package com.test;

public class FirstJavaClass {
    public static void main(String[] args) {
        int sum = calc(11,123);
        System.out.println("the sum of numbers is:" + sum);

    }

    public static int calc(int a, int b) {
        return a+b;
    }
}
