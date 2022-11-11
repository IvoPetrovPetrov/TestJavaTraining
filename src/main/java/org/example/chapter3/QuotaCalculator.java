package org.example.chapter3;

/*
IF ELSE
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String arg[]){
        //known
        int quota = 10;

        //unknown
        System.out.println("Enter the number of sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //decision to the output
        if(sales >= quota){
            System.out.println("Congrats!");
        } else {
            int salesShort = quota - sales;
            System.out.println("You didn't make your quota");
        }
    }
}
