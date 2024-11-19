package com.example.utils;

public class Overloading {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c, int d){
        return a + b + c +d ;
    }

    public String add( String a , String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading load = new Overloading();
        System.out.println(load.add(2,4));
        System.out.println(load.add("hello ", "java"));
        System.out.println(load.add(4,6,7,4));
    }
}
