package com.example.practice;

import java.util.function.BinaryOperator;

public class LambdaMultiples {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a,b) -> a * b;
        int result = multiply.apply(3,18);
        System.out.println(result);

    }
}
