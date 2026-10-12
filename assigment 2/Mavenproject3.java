/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author ibram
 */
import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number1 : "); 
        int num1 = input.nextInt();
        
        System.out.println("Enter operator : "); 
        char Op =input.next().charAt(0);
        System.out.println("Enter number2 : "); 
        int num2 = input.nextInt();
        switch (Op) 
                {
            case '+':
                System.out.println("Result: "+(num1+num2)); 
                break;
                case '-':
                System.out.println("Result: "+(num1-num2)); 
                break;
                case '*':
                System.out.println("Result: "+(num1*num2)); 
                break;
                case '/':
                System.out.println("Result: "+(num1/num2)); 
                break;
                default:
                                    System.out.println("invalid "); 

  
                    
        }
    }
}
