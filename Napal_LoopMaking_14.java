
package napal_loopmaking_14;

import java.util.Scanner;


public class Napal_LoopMaking_14 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0,a,b = 0;
        
        
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        a =  sc.nextInt();
        
       
        while(a > 0){
            b = a % 10;
            num = num + b;
            a = a / 10;
        }
        
        
        
        
        System.out.println("\nThe sum of four digit is: " + (num));
    }
    
}
