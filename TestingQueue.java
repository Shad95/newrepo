package com.example.geometry;

import java.util.LinkedList;

public class TestingQueue {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.offer(4);
        intList.add(3);
//        System.out.println(intList.peek());
        for ( int i = 0; i < intList.size() ; i++){
            System.out.println(intList.get(i));
        }

    }
}
