/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_12;

import java.util.Scanner;

/**
 *
 * @author lab a
 */
public class Napal_LoopMaking_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int a;
        int b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        num =  sc.nextInt();
        
        a = num;
        while(a >= 10){
            a = a / 10;
        }
        b = num % 10;
       
        System.out.println("\nThe first Digit of a given Number: " + num + " = " + a);
        System.out.println("\nThe las digit of a given Number: " + num + " = " + b);
    }
    
}
