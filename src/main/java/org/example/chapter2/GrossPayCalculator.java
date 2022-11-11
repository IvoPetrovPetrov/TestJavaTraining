package org.example.chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg []) {

        //1. Get the number of hours worked
        //Display output to the custom
        System.out.println("Enter the number or worked hours");

        //Receive input from console using scanner
        Scanner scanner = new Scanner(System.in);
        //Enter the number
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter employees pay rate");
        //Enter pay rate
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The employees gross pay is " + grossPay);

    }
}
