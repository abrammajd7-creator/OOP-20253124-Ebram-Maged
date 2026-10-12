/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import java.util.Scanner;

/**
 *
 * @author ibram
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number 1 : "); 
         double num1=input.nextDouble();
          System.out.print("Enter Number 2 : "); 
         double num2=input.nextDouble();
          System.out.print("Enter Number 3 : "); 
         double num3=input.nextDouble();
         double avg = (num1+num2+num3)/3.0;
                 System.out.println("The average "+avg); 
                                  System.out.print("The average "+Math.round(avg)); 


    }
}
