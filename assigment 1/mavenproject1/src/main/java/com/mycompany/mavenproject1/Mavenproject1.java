/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author ibram
 */
public class Mavenproject1 {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print("Enter Radius"); 
double r =input.nextDouble();
double area = Math.pow(r,2)*Math.PI;
double circumference =2*r*Math.PI;
System.out.println("The area"+area); 
System.out.println("The circumference"+circumference); 


    }
}
