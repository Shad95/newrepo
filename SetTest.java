package com.example.geometry;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();
        strSet.add("Apple");
        boolean isAdded = strSet.add("Apple");
        System.out.println(isAdded);
    }
}
