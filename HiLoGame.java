/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hilogame;

/**
 *
 * @author HP 15
 */
import java.util.Random;
import java.util.Scanner;

public class HiLoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int guessCount = 0;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Hi-Lo guessing game!");

            while (!guessedCorrectly) {
                System.out.print("Enter your guess (1-100), or enter 0 to quit: ");
                int guess = scanner.nextInt();

                if (guess == 0) {
                    System.out.println("Quitting the game.");
                    break;
                }

                guessCount++;

                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    System.out.println("Number of guesses: " + guessCount);
                    guessedCorrectly = true;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();

            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing. Goodbye!");
            }
        }

        scanner.close();
    }
}

