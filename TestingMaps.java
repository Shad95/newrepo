package com.example.practice;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("apple",10);
        newMap.put("orange",10);
        newMap.put("lichi",20);
        System.out.println(newMap.get("lichi"));
        System.out.println(newMap.keySet());
        System.out.println(newMap.values());
    }
}
