package com.example.practice;

public class Task2 extends Thread{
    @Override
    public void run() {
        // Task 2
        for (int i = 1; i < 1000 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("Task 2 completed");
    }
}
