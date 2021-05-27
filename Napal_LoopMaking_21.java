/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_21;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Napal_LoopMaking_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, max, bev, lcm = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number ::");
      a = sc.nextInt();
      System.out.println("Enter second number ::");
      b = sc.nextInt();

      if(a > b){
         max = bev = a;
      }
      else{
         max = bev = b;
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
           break;
         }
         max += bev;
      }
      System.out.println("LCM of given numbers is :: "+ lcm);
	
	
        
    }
    
}
