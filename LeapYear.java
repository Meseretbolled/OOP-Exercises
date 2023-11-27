/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyear;

/**
 *
 * @author HP 15
 */

 import java.util.Scanner;

public class LeapYear {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        scanner.close();

        // Check if the year is less than 1582
        if (year < 1582) {
            System.out.println("Error: The Gregorian calendar was adopted in 1582. Please enter a year after 1582.");
        } else {
            // Check if the year is a leap year
            boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
