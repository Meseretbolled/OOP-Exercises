/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.histogram;

/**
 *
 * @author HP 15
 */
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the frequency of each range
        int[] frequency = new int[10];

        // Read input values from the user
        System.out.print("Enter values (1-100, -1 to stop): ");
        int value = scanner.nextInt();
        while (value != -1) {
            if (value >= 1 && value <= 100) {
                int range = (value - 1) / 10; // Calculate the range index
                frequency[range]++; // Increment the frequency for the corresponding range
            }
            value = scanner.nextInt();
        }

        // Print the histogram
        System.out.println("Histogram:");
        for (int i = 0; i < frequency.length; i++) {
            int rangeStart = i * 10 + 1;
            int rangeEnd = (i + 1) * 10;
            System.out.print(rangeStart + " - " + rangeEnd + " | ");
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}