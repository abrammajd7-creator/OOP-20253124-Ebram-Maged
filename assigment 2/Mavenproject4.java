/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author ibram
 */
import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three sides"); 
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1>=num2+num3||num2>=num3+num1||num3>=num2+num1)
            System.out.println("Not a valid triangle"); 
        else if (num1==num2&&num2==num3&&num3==num1)
            System.out.println("Equilateral"); 
        else 
           System.out.println("Isosceles"); 

    }
}
