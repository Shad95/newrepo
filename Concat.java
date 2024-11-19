package com.example.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//        System.out.println("enter the words to be concatenated");
//        System.out.println(concatStrings("Ram"));
//        String result = concatStrings("Ram");
        System.out.println(concatStrings("Ram"));
        System.out.println(concatStrings("Shyam"));
        System.out.println(concatStrings("Hello there"));
    }

    public static String concatStrings(String ... strs){
        StringBuilder sb = new StringBuilder();
        for( String str : strs){
            sb.append(Arrays.toString(strs)).append(" ");
        }
        return sb.toString();
    }
}
