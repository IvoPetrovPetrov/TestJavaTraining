package org.example.chapter3;

import java.util.Scanner;

/*
Create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
Feel free to change this game for your country's currency, so if you don't use dollars and you use something else that's fine.
*/
public class ChangeForADollarGame {

    public static void main(String[] Strings) {

        double penny = .01;
        double nickel = 0.5;
        double dimes = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change a for a Dollar!'");

        System.out.println("Enter your number of pennies");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimmes");
        int numOfDimmes = scanner.nextInt();

        System.out.println("Enter your number of quarters");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimmes * dimes + numOfQuarters * quarter;

        if(total < dollar) {
            double amountShort = dollar - total;
            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;
            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
        }

    }

