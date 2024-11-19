package com.example.practice;

public class Task3 extends Thread{
    @Override
    public void run() {
        // Task 3
        for (int i = 1; i < 1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("Task 3 completed");
    }
}
