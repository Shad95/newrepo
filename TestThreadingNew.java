package com.example.practice;

public class TestThreadingNew {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        System.out.println("starting first thread");
        t1.start();
        System.out.println("starting second thread");
        t2.start();
        System.out.println("starting third thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken:" + (endTime-startTime));
    }
}
