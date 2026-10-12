/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;

/**
 *
 * @author ibram
 */
public class Mavenproject2 {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print("Enter the price"); 
double price=input.nextDouble();
System.out.print("Enter the quantity "); 
int quantity=input.nextInt();
price= price *quantity;
 double prTax = price*0.14;
 double ptTotal = price+prTax;
 System.out.print("= "+price+", Tax = "+prTax+", Total ="+ptTotal); 

    }
}
