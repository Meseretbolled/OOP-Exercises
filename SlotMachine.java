/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.slotmachine;

/**
 *
 * @author HP 15
 */

 import java.util.Random;
import java.util.Scanner;
public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            // Generate three random numbers between 0 and 9
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int num3 = random.nextInt(10);

            // Print the numbers
            System.out.println(num1 + " " + num2 + " " + num3);

            // Check for winning conditions
            if (num1 == num2 && num2 == num3) {
                System.out.println("Congratulations! All numbers are the same!");
            } else if (num1 == num2 || num2 == num3 || num1 == num3) {
                System.out.println("Congratulations! Two numbers are the same!");
            } else {
                System.out.println("Better luck next time!");
            }

            // Ask the user if they want to play again
            System.out.print("Play again? (Y/N): ");
            String choice = scanner.nextLine();
            playAgain = choice.equalsIgnoreCase("Y");
        }

        System.out.println("Thank you for playing!");
    }
}
