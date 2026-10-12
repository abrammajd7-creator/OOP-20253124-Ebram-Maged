/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;
import java.util.Scanner;

/**
 *
 * @author ibram
 */
public class Mavenproject4 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("Enter days "); 
        int day=input.nextInt();
        int week = day/7;
        day = day %7;
        System.out.print(week +"Weeks"+day+"days"); 
    }
}
