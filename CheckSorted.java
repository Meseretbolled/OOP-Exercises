/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checksorted;

/**
 *
 * @author HP 15
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CheckSorted {

    public static void main(String[] args) {
        ArrayList<Integer> listNo = new ArrayList<>();
        int n;
        System.out.print("Enter the size of the list: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        System.out.print("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            listNo.add(temp);
        }

        boolean isSorted = true;
        for (int i = 0; i < listNo.size() - 1; i++) {
            if (listNo.get(i) > listNo.get(i + 1)) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The list is sorted in ascending order.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }
}