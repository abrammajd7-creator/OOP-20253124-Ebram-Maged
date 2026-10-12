/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication55;
import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                    System.out.print("Enter number");

        int num=input.nextInt();
        int digit;
        int rnum=0;
        while(num!=0){
        digit = num%10;
        rnum= rnum*10+digit;
      
        
        num/=10;
        }
        System.out.print(rnum);
    }
    
}
