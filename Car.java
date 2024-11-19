package com.example.utils;

public class Car extends Vehicle{

    @Override
    public void service() {
        super.service();
        System.out.println("Car is being serviced");
    }
}
