/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixby;

/**
 *
 * @author HP 15
 */

import java.util.Random;
public class MatrixBy 


 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2); // Generates either 0 or 1
            }
        }

        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // Find the row with the most 1s
        int maxRowIndex = 0;
        int maxRowOnes = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowOnes++;
                }
            }
            if (rowOnes > maxRowOnes) {
                maxRowOnes = rowOnes;
                maxRowIndex = i;
            }
        }

        // Find the column with the most 1s
        int maxColIndex = 0;
        int maxColOnes = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int colOnes = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    colOnes++;
                }
            }
            if (colOnes > maxColOnes) {
                maxColOnes = colOnes;
                maxColIndex = j;
            }
        }

        // Print the results
        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}
 
