
package napal_loopmaking_5;

import java.util.Scanner;


public class Napal_LoopMaking_5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int i,b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms:");
       b = sc.nextInt();
       
       for( i = 1; i<= b ; i++){
           System.out.println("Number is: " + i + " and cube of " + i + " is : " + (i*i*i));
       }
    }
    
}
