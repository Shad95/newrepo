package com.example.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("enter the elements of list");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
           int j = sc.nextInt();
           list.add(j);
        }
        int freq = 0;
        System.out.println(" enter the element to be counted");
        int element = sc.nextInt();
        System.out.println(" the element is "+ element);
        for( int i = 0; i < 5; i++){
            if(list.get(i).equals(element)){
                freq++;
            }
        }
        System.out.printf("the element %d occurred %d times",element,freq);
        System.out.println("---------------------------------");
        System.out.println(Collections.frequency(list,2));


    }
}
