package com.example.geometry;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Ram");
        strList.add("Shyam");
        strList.add("Aplha");
        strList.add("Gamma");
        Collections.sort(strList);

//        strList.add(73.45);
//        strList.add(1,"Holy");
//        if(strList.contains("Shyam")){
//            System.out.println(strList.indexOf("Shyam"));
//        }
//        strList.remove(1);
        for( int i = 0; i< strList.size() ; i++){
            System.out.println( strList.get(i));
        }
    }
}
