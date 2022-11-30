package org.example.chapter5;
/*
 *calculate perimeter
 * calculate area
 */
public class Rectangle {

    private double length;
    private double width;

    double calculatePerimeter(){
        return (2 * length) + (2 * width);

    }

    double calculateArea(){
        return length * width;


    }

}


