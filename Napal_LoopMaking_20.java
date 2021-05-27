/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_20;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Napal_LoopMaking_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0; 
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = Sc.nextInt();
        int i,fact=1;
        for(i=1;i<=number;i++){   
         fact=fact*i;
     
     
  }    
  System.out.println("Factorial of "+ number + " is: " + fact); 
    }
    
}
