/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.monetaryamount;

/**
 *
 * @author HP 15
 */
import java.util.Scanner;

public class MonetaryAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a monetary amount
        System.out.print("Enter a monetary amount: ");
        double amount = scanner.nextDouble();

        // Convert the amount to cents
        int cents = (int) (amount * 100);

        // Calculate the number of each bill and coin
        int tenDollarBills = cents / 1000;
        cents %= 1000;

        int fiveDollarBills = cents / 500;
        cents %= 500;

        int oneDollarBills = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        // Print the equivalent amount in bills and coins
        System.out.println("Equivalent amount:");
        System.out.println(tenDollarBills + " ten dollar bills");
        System.out.println(fiveDollarBills + " five dollar bills");
        System.out.println(oneDollarBills + " one dollar bills");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}