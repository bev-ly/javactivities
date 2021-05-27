/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_8;

import java.util.Scanner;

/**
 *
 * @author lab a
 */
public class Napal_LoopMaking_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num;
        int i;
        int evenSum = 0;
        
       Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number: ");
       num = sc.nextInt();
       
       for (i = 1; i <= num; i++){
           if(i % 2 == 0){
               evenSum = evenSum + i;
           }
       }
        System.out.println("Sum: " + evenSum);
    }
    
}
