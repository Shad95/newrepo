package com.example.practice;

import java.util.List;
import java.util.function.Consumer;

public class TestingStream {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple" , "mango" , "banana" , "date");
        System.out.println(fruits.size());
        System.out.println("printing normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("printing using stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruits) {
                System.out.println(fruits);
            }
        });
        System.out.println("printing using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
