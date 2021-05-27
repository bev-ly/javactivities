/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_1;

import java.util.Scanner;

/**
 *
 * @author lab a
 */
public class Napal_LoopMaking_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b = 0;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a number");
         b = sc.nextInt();
         System.out.println("\n");
        for ( int i = 1; i<= b;i++){
            
            System.out.println(i);
        }
    }
    
}
