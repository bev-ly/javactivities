/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_11;

import java.util.Scanner;

/**
 *
 * @author lab a
 */
public class Napal_LoopMaking_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int digit = 0;
        for(; num != 0; num = num / 10, ++digit){
            
        }
        System.out.println("Digit/s: " + digit);
    }
    
}
