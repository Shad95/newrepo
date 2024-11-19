package com.example.utils;

import java.util.Scanner;

public class Square extends Shape {
    int side;


    @Override
    public double calculateArea() {
        System.out.println("enter the side of square");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        int sqArea = side * side;
        System.out.println(" the area of square is:" + sqArea);
        return sqArea;
    }
}
