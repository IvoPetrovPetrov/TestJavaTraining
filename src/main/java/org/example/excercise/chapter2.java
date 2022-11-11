package org.example.excercise;

import java.util.Scanner;

public class chapter2 {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of the year");
        String season = scanner.next();

        System.out.println("Enter a whole number ");
        int wholeNumber = scanner.nextInt();

        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee ");

    }
}
