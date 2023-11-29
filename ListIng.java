/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listing;

/**
 *
 * @author HP 15
 * 
 */
import.java.util.Scanner
public class ListIng {

    public static void main(String[] args) {
        ArrayList(Integer)integers=new.ArrayList<>();
        System.out.println("enter 5 integers");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<integers.size;i++)
        {
            int temp=input.nextInt();
            if(!integers.contains(temp))//to check it there is an elemetn or not
             integers.add(temp);   
        }
        collections.sort(integers);
        System.out.println(integers);
        
    }
}
