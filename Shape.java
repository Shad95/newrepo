package com.example.utils;

public abstract class Shape {

    public abstract double calculateArea();

    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea();
        Square sq = new Square();
        sq.calculateArea();
    }
}
