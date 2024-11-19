package com.example.practice;

public class TestThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // Task 1
        for (int i = 1; i < 1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("Task 1 completed");
        // Task 2
        for (int i = 1; i < 1000 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("Task 2 completed");
        // Task 3
        for (int i = 1; i < 1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("Task 3 completed");

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken:" + (endTime-startTime));
    }
}
