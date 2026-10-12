/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author ibram
 */
import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter year"); 
        int year = input.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0)
            System.out.println("Leap year"); 
        else
            System.out.println("Not Leap year"); 

    }
}
