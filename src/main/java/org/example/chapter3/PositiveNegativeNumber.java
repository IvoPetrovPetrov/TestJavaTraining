package org.example.chapter3;

import java.util.Scanner;

/*
Get a number from the user and print it whether is positive or negative
 */

public class PositiveNegativeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number please");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("The number is positive");
        }else if(number < 0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }

    }

}
