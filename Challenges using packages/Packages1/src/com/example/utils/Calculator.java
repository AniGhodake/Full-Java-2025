package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rect.breadth * rect.length;

        System.out.printf("Area of Circle is : %.2f, Area of rectangle is : %.2f ", cirArea, rectArea);

    }
}
