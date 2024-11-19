package com.example.utils;

import java.util.Scanner;

public class Circle extends Shape{
    double radius;

    @Override
    public double calculateArea() {
        System.out.println("enter the raduis of circle");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        double circArea = Math.PI * radius *radius;
        System.out.println(" the are of circle is:" + circArea);
        return circArea ;
    }
}
