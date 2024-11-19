package com.example.practice;

import java.util.List;
import java.util.stream.Stream;

public class ListConcat {
    public static void main(String[] args) {
        List<String> names = List.of("Virat Kohli","Rohit Sharma",
                "Jasprit Bumrah","Shami","Siraj");
            String result = names.stream()
                            .filter(name -> name.length() > 10)
                            .reduce("", (a,b) -> a + " " + b);
        System.out.println(result);

    }
}
