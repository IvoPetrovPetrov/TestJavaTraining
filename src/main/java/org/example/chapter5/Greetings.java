package org.example.chapter5;

import java.util.Scanner;

/*
 Write a method that ask a user for their name and greets by name.
 */
public class Greetings {

    public static void main (String arg []){

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);

    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name);

    }

}
