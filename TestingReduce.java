package com.example.practice;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List <Integer> numbers = List.of(1,3,2,6,7,4,8);
        System.out.print(" the sum of elements of list normally are:");
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        int reduceSum = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.println("the sum using reduce is:" + reduceSum);

        System.out.println(" using lambda now");
        System.out.println("the sum using lambda reduce is:"
                + numbers.stream().reduce(0,(a,b) -> a + b));
    }
}
