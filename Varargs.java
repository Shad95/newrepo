package com.example.geometry;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(sum(2,4));
    }

    public static int sum( int first, int second, int... a) {
        int sum = first + second;
        for (int i : a) {
           sum = sum + i;
        }
        return sum;
    }
}
