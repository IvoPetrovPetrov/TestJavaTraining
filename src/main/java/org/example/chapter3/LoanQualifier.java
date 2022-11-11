package org.example.chapter3;

/*
To qualify for a loan, a person must take at least 30,000$
and have benn working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

   public static void main(String[] args) {

       //known
       int requiredSalary = 30000;
       int requiredYears = 2;

       //get unknown
       System.out.println("Enter your salary");
       Scanner scanner = new Scanner(System.in);
       double salary = scanner.nextDouble();

       System.out.print("Enter the number of years with your current employer:");
       double years = scanner.nextDouble();

       scanner.close();

       //decision

       if (salary >= requiredSalary) {
           if (years >= requiredYears) {
               System.out.print("Congrats! You qualify for the loan");
           } else {
               System.out.print("Sorry, you must have worked at your current job " + requiredYears + " years.");
           }
       } else {
           System.out.print("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");

       }
   }
   }

