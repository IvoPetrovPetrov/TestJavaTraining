package org.example.chapter5;

import java.util.Scanner;

/*
 *Find the smallest number among three once
 */
public class SmallestNumber {


    public static void main (String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first number:");
        double x = scanner.nextDouble();
        System.out.println("Insert second number:");
        double y = scanner.nextDouble();
        System.out.println("Insert second number:");
        double z = scanner.nextDouble();

        System.out.println("The smallest value is " + smallest(x, y, z));

    }

    public static double smallest(double x, double y, double z){
        return Math.min(Math.min(x, y), z);
    }
}
