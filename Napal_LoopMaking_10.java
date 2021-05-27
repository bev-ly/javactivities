/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_10;

import java.util.Scanner;

/**
 *
 * @author lab a
 */
public class Napal_LoopMaking_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num,i = 1;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        
        while (i <= 10){
            System.out.println(i + " * " + num + " = " + (num * i) );
            i++;
        }
    }
    
}
