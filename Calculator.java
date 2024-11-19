package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import org.w3c.dom.css.Rect;

public class Calculator {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(" the area of circle is:" +c.returnArea(5));

        Rectangle r = new Rectangle();
        System.out.println(" the area of rectangle is:"
                + r.returnRectArea(5,7));
    }
}
