/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication56;
import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                    System.out.print("Enter number");
                            int n=input.nextInt();

                    boolean prime = true;
                    if (n<2)
                        prime=false;
                    else{
                    for(int i=2;i<n;i++)
                        if(n%i==0)
                        {
                        prime=false;
                        break;}
            {
                
                if(prime)
                    System.out.println("prime");
                else
                                        System.out.println("not prime");

            }
                    }
    }
    
}
