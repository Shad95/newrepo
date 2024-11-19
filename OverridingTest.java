package com.example.utils;

public class OverridingTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
//        System.out.println(v.start());
        c.service();
    }
}
