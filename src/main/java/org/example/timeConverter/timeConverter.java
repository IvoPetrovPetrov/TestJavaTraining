package org.example.timeConverter;

import java.util.Scanner;

public class timeConverter {
    public static void main(String arg []) {
        /*Program that convert days to seconds:
        input a day as a number and  output in seconds
        1*24 = 24 hours * 60 = 1440 minutes * 60 = 86400 seconds*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a day that you want to calculate in seconds");

        int days = scanner.nextInt();

        scanner.close();

        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int res = days*hours*minutes*seconds;
        System.out.println("You insert " + "" + days + " days " + " which are calculated in " + "" + res + "" + " seconds ");

    }
}
