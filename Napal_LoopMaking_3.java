/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_3;

import java.util.Scanner;

/**
 *
 * @author lab a
 */
public class Napal_LoopMaking_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int b = 0, sum = 0;
       
       Scanner  sc = new Scanner(System.in);
       System.out.print("The first 7 narutal number is: ");
       b = sc.nextInt();
       
       for (int i = 1; i<= b; i++){
           sum += i;
           System.out.print(i + " ");
        }
        System.out.println("\nThe sum of natural number up to nterms is :" + sum);
           
    }
    
}
