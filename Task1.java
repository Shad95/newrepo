package com.example.practice;
class Task1 extends Thread{
    @Override
    public void run() {
        // Task 1
        for (int i = 1; i < 1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("Task 1 completed");
    }
}
