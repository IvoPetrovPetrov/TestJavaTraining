package org.example.chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

/*
 *User to input the plan fee and the number of overage minutes
 *charge 25 cents for every minute hang over
 *15% tax on the subtotal
 *create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 *Please print this as an itemized bill
 */

    public static void main(String arg []){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter minutes:");
        double overageMinutes = scanner.nextDouble();

        scanner.close();

        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);

    }

    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;

    }

    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));

    }

}
