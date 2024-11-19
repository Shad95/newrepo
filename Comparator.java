package com.example.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<>();
        newList.add("hello");
        newList.add("there");
        newList.add("how");
        newList.add("are");
        newList.add("you");
        Collections.sort(newList);
        Collections.reverse(newList);
        System.out.println(" the sorted list in descending order is:");
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
}
