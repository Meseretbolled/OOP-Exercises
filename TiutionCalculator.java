/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiutioncalculator;

/**
 *
 * @author HP 15
 */
public class TiutionCalculator {

    public static void main(String[] args) {
        double tuition =1000;
        double annualIncrease =0.05;
        for(int i=1;i<=10;i++)
        {
            tuition +=tuition*annualIncrease;
            
        }
        double totalCost=0;
        for(int i=0;i<4;i++)
        {
            tuition +=tuition*annualIncrease;
            totalCost+=tuition;
   
        }
        System.out.println("tuition in ten years :"+tuition);
         System.out.println("total cost of four years worth of tuition after the tenth year :"+totalCost);
        
    }
}
