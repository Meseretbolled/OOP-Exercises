/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.africancapitalquiz;

/**
 *
 * @author HP 15
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AfricanCapitalQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a map of African country-capital pairs
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Algeria", "Algiers");
        capitals.put("Angola", "Luanda");
        capitals.put("Egypt", "Cairo");
        capitals.put("Kenya", "Nairobi");
        capitals.put("Morocco", "Rabat");
        capitals.put("Nigeria", "Abuja");
        capitals.put("South Africa", "Pretoria");
        // Add more country-capital pairs as needed

        int correctCount = 0;

        // Prompt the user for capital cities
        for (String country : capitals.keySet()) {
            System.out.print("Enter the capital city of " + country + ": ");
            String userAnswer = scanner.nextLine();

            String correctAnswer = capitals.get(country);
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswer);
            }
        }

        // Display the total correct count
        System.out.println("Total correct: " + correctCount);
    }
}
