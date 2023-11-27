/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisiblenumbers;

/**
 *
 * @author HP 15
 * 
 */
import java.util.Scanner;
public class DivisibleNumbers {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.print("Enter the first divisibility criterion: ");
        int divisor1 = scanner.nextInt();

        System.out.print("Enter the second divisibility criterion: ");
        int divisor2 = scanner.nextInt();

        scanner.close();

        int count = 0; // Keep track of the number of divisible numbers

        for (int i = start; i <= end; i++) {
            if ((i % divisor1 == 0 || i % divisor2 == 0) && !(i % divisor1 == 0 && i % divisor2 == 0)) {
                System.out.print(i + " ");
                count++;

                // Check if ten numbers have been printed per line
                if (count % 10 == 0) {
                    System.out.println(); // Move to the next line
                }
            }
        }
    }
}
