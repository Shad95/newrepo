package com.example.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        String [] arr = {"mango", "apple","lichi","banana"};
        Arrays.stream(arr).forEach(fruit -> System.out.println(fruit));

    }
}
