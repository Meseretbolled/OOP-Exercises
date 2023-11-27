/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prizeselection;

/**
 *
 * @author HP 15
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PrizeSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of finalists: ");
        int numFinalists = scanner.nextInt();

        // Create a list of all finalist numbers
        List<Integer> finalistNumbers = new ArrayList<>();
        for (int i = 1; i <= numFinalists; i++) {
            finalistNumbers.add(i);
        }

        // Check if there are enough finalists for 3 prizes
        if (numFinalists < 3) {
            System.out.println("Error: There are not enough finalists for 3 prizes.");
        } else {
            // Randomly select three unique numbers from the finalist pool
            List<Integer> selectedNumbers = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                int randomIndex = random.nextInt(finalistNumbers.size());
                int selectedNumber = finalistNumbers.get(randomIndex);
                selectedNumbers.add(selectedNumber);
                finalistNumbers.remove(randomIndex);
            }

            // Print the selected numbers
            System.out.println("The winners are:");
            for (int i = 0; i < 3; i++) {
                System.out.println(selectedNumbers.get(i));
            }
        }

        scanner.close();
    }
}